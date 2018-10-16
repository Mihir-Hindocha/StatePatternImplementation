import java.util.Scanner;

/**
 * This is the driver class for the Calculator program. This will be used to test all the functionality.
 * */

public class Application {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Calculator trial = new Calculator();
        trial.calculate(input);

    }
}
