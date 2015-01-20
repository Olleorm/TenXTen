import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class NumberGrid {
    private static final int RANDOM_NUMBER = 10;
    static Random rand = new Random();
    public int numberColumns;
    public int numberRows;
    int [][] grid;
    public NumberGrid (int chosenNumberRows,int chosenNumberColumns ){
        numberColumns = chosenNumberColumns;
        numberRows = chosenNumberRows;
        grid = new int [numberRows][numberColumns];
    }

    private static int randomInt(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }

    public void amountOfSpecificNumbers() {
        int[] numbers = new int[11];
        for (int y = 0; y < numberRows; y++) {
            for (int x = 0; x < numberColumns; x++) {
                int value = grid[y][x];
                numbers[value]++;
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(" " + numbers[i] + " " + i + "s" );
        }
    }

    public void sumOfColumns() {
        int sumOfColumns[] = new int[numberColumns];
        for (int x = 0; x < numberColumns; x++) {
            for (int y = 0; y < numberRows; y++) {
                sumOfColumns[x] += grid[y][x];
            }
        }
        System.out.println(Arrays.toString(sumOfColumns));
    }

    public void sumOfRows() {
        int sumOfRows[] = new int[numberRows];
        for (int y = 0; y < numberRows; y++) {
            for (int x = 0; x < numberColumns; x++) {
                sumOfRows[y] += grid[y][x];
            }
        }
        System.out.println(Arrays.toString(sumOfRows));
    }

    public void newField() {
        for (int x = 0; x < numberColumns; x++) {
            for (int y = 0; y < numberRows; y++) {
                int randomNumber = (randomInt(1, RANDOM_NUMBER));
                grid[y][x] = randomNumber;
            }
        }
    }

    public void showField() {
        for (int y = 0; y < numberRows; y++) {
            for (int x = 0; x < numberColumns; x++) {
                if (grid[y][x] < 10) {
                    System.out.print(" " + grid[y][x] + " ");
                } else {
                    System.out.print(grid[y][x] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int readInt(Scanner scanner){
        String prompt = ("Pleas enter number 1, 2, 3, 4, 5, or 6");
        System.out.println(prompt);
        while(!scanner.hasNext("[1-6]")) {
            System.out.println(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

}

class GridColumns {
    public static int readInt(Scanner scanner){
        String prompt = ("Pleas enter the number of columns you want");
        System.out.println(prompt);
        while(!scanner.hasNextInt()) {

            System.out.println("That's not a number");
            System.out.println(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
class GridRows{
    public static int readInt(Scanner scanner){
        String prompt = ("Pleas enter the number of rows you want");
        System.out.println(prompt);
        while(!scanner.hasNextInt()) {

            System.out.println("That's not a number");
            System.out.println(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }
}


public class TenXTen {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumberGrid popcorn = new NumberGrid(GridRows.readInt(scanner),GridColumns.readInt(scanner));

        popcorn.newField();
        popcorn.showField();
        while(true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Get a new field");
            System.out.println("2. Show current field");
            System.out.println("3. Count the numbers in the current field");
            System.out.println("4. Sum all rows");
            System.out.println("5. Sum all columns");
            System.out.println("6. Exit program");

            int choice = popcorn.readInt(scanner);

            switch (choice) {
                case 1:
                    popcorn.newField();
                    popcorn.showField();
                    break;
                case 2:
                    popcorn.showField();
                    break;
                case 3:
                    popcorn.amountOfSpecificNumbers();
                    break;
                case 4:
                    popcorn.sumOfRows();
                    break;
                case 5:
                    popcorn.sumOfColumns();
                    break;
                case 6:
                    return;

                }
            }
        }
    }

