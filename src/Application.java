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
 * Sample Input :           Sample Output:
 * 123+456                  579
 * 5234-1462                3772
 * 1+2                      3
 * 34+12-6                  40
 * 1*2                      Exception in thread "main" java.lang.Error: Invalid input encountered. Please check and try again.
 *                              at S1.performOperation(S1.java:35)
 *                              at Calculator.calculate(Calculator.java:63)
 *                              at Application.main(Application.java:13)
 * <p>
 */