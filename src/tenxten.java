import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TenXTen {
    private static final int RANDOM_NUMBER = 10;
    private static final int NUMBER_ROWS = 10;
    private static final int NUMBER_COLUMNS = 10;
    static Random rand = new Random();
    static int [][] grid = new int [NUMBER_COLUMNS][NUMBER_ROWS];


    private static int randomInt(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }

    private static void amountOfSpecificNumbers() {
        int[] numbers = new int[NUMBER_COLUMNS * NUMBER_ROWS];
        for (int i = 1; i < RANDOM_NUMBER; i++) {
            for (int y = 0; y < NUMBER_ROWS; y++) {
                for (int x = 0; x < NUMBER_COLUMNS; x++) {
                    if (grid[x][y] == i) {
                        numbers[i] += i;
                    }
                }
            }
            System.out.println(" " + numbers[i] / i + " " + i + "s" );
        }
    }

    private static void sumOfColumns() {
        int sumOfColumns[] = new int[NUMBER_COLUMNS];
        for (int y = 0; y < NUMBER_COLUMNS; y++) {
            for (int x = 0; x < NUMBER_ROWS; x++) {
                sumOfColumns[y] += grid[x][y];
            }
        }
        System.out.println(Arrays.toString(sumOfColumns));
    }

    private static void sumOfRows() {
        int sumOfRows[] = new int[NUMBER_COLUMNS];
        for (int y = 0; y < NUMBER_COLUMNS; y++) {
            for (int x = 0; x < NUMBER_ROWS; x++) {
                sumOfRows[x] += grid[x][y];
            }
        }
        System.out.println(Arrays.toString(sumOfRows));
    }

    private static void newField() {
        for (int x = 0; x < NUMBER_COLUMNS; x++) {
            for (int y = 0; y < NUMBER_ROWS; y++) {
                int randomNumber = (randomInt(1, RANDOM_NUMBER));
                grid[x][y] = randomNumber;
            }
        }
    }

    private static void showField() {
        for (int x = 0; x < NUMBER_COLUMNS; x++) {
            for (int y = 0; y < NUMBER_ROWS; y++) {
                if (grid[x][y] < 10) {
                    System.out.print(" " + grid[x][y] + " ");
                } else {
                    System.out.print(grid[x][y] + " ");
                }
            }
            System.out.println();
        }
    }

    private static int readInt(Scanner scanner){
        String prompt = ("Pleas enter number 1, 2, 3, 4, 5, or 6");
        System.out.println(prompt);
        while(!scanner.hasNext("[1-6]")) {
            System.out.println(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        newField();
        showField();
        while(true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Get a new field");
            System.out.println("2. Show current field");
            System.out.println("3. Count the numbers in the current field");
            System.out.println("4. Sum all rows");
            System.out.println("5. Sum all columns");
            System.out.println("6. Exit program");
            Scanner scanner = new Scanner(System.in);

            int choice = readInt(scanner);



            switch (choice) {
                case 1:
                    newField();
                    showField();
                    break;
                case 2:
                    showField();
                    break;
                case 3:
                    amountOfSpecificNumbers();
                    break;
                case 4:
                    sumOfRows();
                    break;
                case 5:
                    sumOfColumns();
                    break;
                case 6:
                    return;

                }
            }
        }
    }

