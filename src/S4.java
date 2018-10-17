/**
 * Class representing the first state S4.
 */

public class S4 implements State {

    private static S4 state4;

    public synchronized static S4 getInstance() {
        if (state4 == null) {
            state4 = new S4();
        }
        return state4;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {
//        System.out.println("Entered the function in State 4 Successfully!!");
//        System.out.println("Input received at State 4 is " + input);
//        calculator.changeState(S5.getInstance());

        int c = Character.getNumericValue(input);
        if (c > 0) {
            calculator.updateN(c);
            calculator.changeState(S6.getInstance());
        } else
            System.out.println("Error in input of State 4");
    }
}
