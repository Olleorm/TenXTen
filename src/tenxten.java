import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        while(true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Get a new field");
            System.out.println("2. Count the numbers in the current field");
            System.out.println("3. Sum all rows");
            System.out.println("4. Sum all columns");
            System.out.println("5. Exit program");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice > 6 || choice < 0) {
                System.out.println("That's not number 1, 2, 3, 4, or 5");
                System.out.println("Pleas enter number 1, 2, 3, 4, or 5");
            } else if (choice == 1){
                newFeild();
            } else if (choice == 2){
                amountOfSpecificNumbers();
            } else if (choice == 3){
                sumOfRows();
            } else if (choice == 4){
                sumOfColumns();
            } else{
                return;
            }
        }
    }
}
