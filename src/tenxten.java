import java.util.Arrays;
import java.util.Random;

/**
 * Created by Olleorm on 2015-01-17.
 */
public class tenxten {
    static int numberRows = 10;
    static int numberColumns = 10;
    static int [][] grid = new int [numberColumns][numberRows];

    private static int randomInt(int from, int to) {
        Random rand = new Random();
        return rand.nextInt(to - from + 1) + from;
    }
    private static void amountOfSpecificNumbers() {
        int[] numbers = new int[numberColumns * numberRows];
        for (int i = 1; i < 10; i++) {
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 10; x++) {
                    if (grid[y][x] == i) {
                        numbers[i] += i;
                    }
                }
            }
            System.out.println(" " + numbers[i] / i + " " + i + "s" );
        }
    }

    private static void sumOfColumns() {
        int sumOfColumns[] = new int[numberColumns];
        for (int x = 0; x < numberColumns; x++) {
            for (int y = 0; y < numberRows; y++) {
                sumOfColumns[y] += grid[x][y];
            }
        }
        System.out.println(Arrays.toString(sumOfColumns));
    }


    private static void sumOfRows() {
        int sumOfRows[] = new int[numberColumns];
        for (int x = 0; x < numberColumns; x++) {
            for (int y = 0; y < numberRows; y++) {
                sumOfRows[x] += grid[x][y];
            }
        }
        System.out.println(Arrays.toString(sumOfRows));
    }

    private static void newFeild() {
        for (int x = 0; x < numberColumns; x++) {
            for (int y = 0; y < numberRows; y++) {
                int randomNumber = (randomInt(1, 10));
                grid[x][y] = randomNumber;
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
        sumOfColumns();
        amountOfSpecificNumbers();

    }

}
