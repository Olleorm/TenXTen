import java.util.Random;

/**
 * Created by Olleorm on 2015-01-17.
 */
public class tenxten {

    private static int randomInt(int from, int to) {
        Random rand = new Random();
        return rand.nextInt(to - from + 1) + from;
    }

    int oneToTen = randomInt(1, 10);


    public static void main(String[] args) {
        int numberRows = 10;
        int numberColums = 10;

        int [][] twoDim = new int [numberColums][numberRows];

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


    }


}
