import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class NumberGrid {
    private static final int RANDOM_NUMBER = 10;
    static Random rand = new Random();
    public int numberRows;
    public int numberColumns;
    int [][] grid;
    public NumberGrid (int chosenNumberColumns,int chosenNumberRows){
        numberRows = chosenNumberRows;
        numberColumns = chosenNumberColumns;
        grid = new int [numberColumns][numberRows];
    }

    private static int randomInt(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }

    private void amountOfSpecificNumbers() {
        int[] numbers = new int[numberColumns * numberRows];
        for (int i = 1; i < RANDOM_NUMBER; i++) {
            for (int y = 0; y < numberRows; y++) {
                for (int x = 0; x < numberColumns; x++) {
                    if (grid[x][y] == i) {
                        numbers[i] += i;
                    }
                }
            }
            System.out.println(" " + numbers[i] / i + " " + i + "s" );
        }
    }

    private void sumOfColumns() {
        int sumOfColumns[] = new int[numberColumns];
        for (int y = 0; y < numberColumns; y++) {
            for (int x = 0; x < numberRows; x++) {
                sumOfColumns[y] += grid[x][y];
            }
        }
        System.out.println(Arrays.toString(sumOfColumns));
    }

    private void sumOfRows() {
        int sumOfRows[] = new int[numberColumns];
        for (int y = 0; y < numberColumns; y++) {
            for (int x = 0; x < numberRows; x++) {
                sumOfRows[x] += grid[x][y];
            }
        }
        System.out.println(Arrays.toString(sumOfRows));
    }

    public void newField() {
        for (int x = 0; x < numberColumns; x++) {
            for (int y = 0; y < numberRows; y++) {
                int randomNumber = (randomInt(1, RANDOM_NUMBER));
                grid[x][y] = randomNumber;
            }
        }
    }

    public void showField() {
        for (int x = 0; x < numberColumns; x++) {
            for (int y = 0; y < numberRows; y++) {
                if (grid[x][y] < 10) {
                    System.out.print(" " + grid[x][y] + " ");
                } else {
                    System.out.print(grid[x][y] + " ");
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
        NumberGrid popcorn = new NumberGrid(GridColumns.readInt(scanner),GridRows.readInt(scanner));

        popcorn.newField();
        //showField();
        while(true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Get a new field");
            System.out.println("2. Show current field");
            System.out.println("3. Count the numbers in the current field");
            System.out.println("4. Sum all rows");
            System.out.println("5. Sum all columns");
            System.out.println("6. Exit program");


            //int choice = readInt(scanner);



           // switch (choice) {
              //  case 1:
                  //  newField();
                  //  showField();
              //      break;
              //  case 2:
                   // showField();
              //      break;
             //   case 3:
                   // amountOfSpecificNumbers();
             //       break;
               // case 4:
                   // sumOfRows();
              //      break;
              //  case 5:
                   // sumOfColumns();
              //      break;
              //  case 6:
               //     return;

               // }
            }
        }
    }

