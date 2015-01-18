import java.util.Random;

/**
 * Created by Olleorm on 2015-01-17.
 */
public class tenxten {
    static int numberRows = 10;
    static int numberColums = 10;
    static int [][] twoDim = new int [numberColums][numberRows];
    static int a = (twoDim.length);
    static int b = (twoDim[0].length);


    private static int randomInt(int from, int to) {
        Random rand = new Random();
        return rand.nextInt(to - from + 1) + from;
    }

    private static void numbersNr() {
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



    public static void main(String[] args) {


        int a = (twoDim.length);
        int b = (twoDim[0].length);

        for(int i = 0; i < a; i++){
            int sum = 0;
            for(int j = 0; j < b; j++) {
                int x = (randomInt(1, 10));
                twoDim[i][j] = x;
                sum += x;

                if (x < 10) {
                    System.out.print(" " + x + " ");
                } else {
                    System.out.print(x + " ");
                }
                if (j == numberRows - 1){
                    System.out.print(sum);
                }
            }//end of for J
            System.out.println();
        }//end of for i

        numbersNr();
    }


}
