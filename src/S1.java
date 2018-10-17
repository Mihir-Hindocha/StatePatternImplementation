/**
 * Class representing the second state S1.
 */

public class S1 implements State {

    private static S1 state1;

    public synchronized static S1 getInstance() {
        if (state1 == null) {
            state1 = new S1();
        }
        return state1;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {
//        System.out.println("Entered the function in State 1 Successfully!!");
//        System.out.println("Input received at State 1 is " + input);
        int c = Character.getNumericValue(input);
        if (c >= 0) {
            calculator.updateN(calculator.getN() * 10 + c);
            calculator.changeState(S2.getInstance());
        } else if (input == '+') {
            calculator.updateN(calculator.getN());
            calculator.changeState(S4.getInstance());
        } else if (input == '-') {
            calculator.updateN(calculator.getN());
            calculator.changeState(S3.getInstance());
        } else
            System.out.println("Error in input of State 1");
    }
}
