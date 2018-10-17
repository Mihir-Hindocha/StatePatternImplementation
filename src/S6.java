/**
 * Class representing the first state S6.
 */

public class S6 implements State {

    private static S6 state6;

    public synchronized static S6 getInstance() {
        if (state6 == null) {
            state6 = new S6();
        }
        return state6;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {
//        System.out.println("Entered the function in State 6 Successfully!!");
//        System.out.println("Input received at State 6 is " + input);
//        calculator.changeState(S0.getInstance());
        int c = Character.getNumericValue(input);
        if (c >= 0) {
            calculator.updateN(calculator.getN() * 10 + c);
            calculator.changeState(S6.getInstance());
        } else if (input == '+') {
            calculator.updateTotal(calculator.getTotal() + calculator.getN());
            calculator.changeState(S4.getInstance());
        } else if (input == '-') {
            calculator.updateTotal(calculator.getTotal() + calculator.getN());
            calculator.changeState(S3.getInstance());
        } else
            System.out.println("Error in input of State 6");
    }
}
