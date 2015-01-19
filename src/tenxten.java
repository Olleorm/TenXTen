import java.util.Arrays;
import java.util.Random;

/**
 * Created by Olleorm on 2015-01-17.
 */
public class tenxten {
    static int numberRows = 10;
    static int numberColums = 10;
    static int [][] twoDim = new int [numberColums][numberRows];

    private static int randomInt(int from, int to) {
        Random rand = new Random();
        return rand.nextInt(to - from + 1) + from;
    }
    private static void amountOfSpecificNumbers() {
        int[] numbers = new int[numberColums * numberRows];
        int conter = 0;

        for (int i = 1; i < 10; i++) {
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 10; x++) {
                    if ((twoDim[y][x] / (double) i) == 1) {
                        numbers[i] += i;
                    }
                }
            }
            System.out.println(" " + numbers[i] / i + " " + i + "s" );
        }
    }

    private static void sumOfRows() {
        int sumOfRows[] = new int[numberColums];
        for (int x = 0; x < numberColums; x++) {
            for (int y = 0; y < numberRows; y++) {
                sumOfRows[x] += twoDim[x][y];
            }
        }
        System.out.println(Arrays.toString(sumOfRows));
    }

    private static void newFeild() {
        int row = (twoDim.length);
        int colum = (twoDim[0].length);
        for (int x = 0; x < row; x++) {
            int sum = 0;
            for (int y = 0; y < colum; y++) {
                int randomNumber = (randomInt(1, 10));
                twoDim[x][y] = randomNumber;
                sum += randomNumber;
                if (randomNumber < 10) {
                    System.out.print(" " + randomNumber + " ");
                } else {
                    System.out.print(randomNumber + " ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        newFeild();

        sumOfRows();

        amountOfSpecificNumbers();

    }

}
