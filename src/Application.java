import java.util.Scanner;

/**
 * This is the driver class for the Calculator program. This will be used to test all the functionality.
 */

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Calculator calculator = new Calculator();
        calculator.calculate(input);
    }
}
/**
 * Run Application.java as Java Application
 * <p>
 * Sample Input : 123+456
 * <p>
 * Sample output:
 * <p>
 * Entered the function in State 0 Successfully!!
 * Input received at State 0 is 1
 * Entered the function in State 1 Successfully!!
 * Input received at State 1 is 2
 * Entered the function in State 2 Successfully!!
 * Input received at State 2 is 3
 * Entered the function in State 3 Successfully!!
 * Input received at State 3 is +
 * Entered the function in State 4 Successfully!!
 * Input received at State 4 is 4
 * Entered the function in State 5 Successfully!!
 * Input received at State 5 is 5
 * Entered the function in State 6 Successfully!!
 * Input received at State 6 is 6
 */