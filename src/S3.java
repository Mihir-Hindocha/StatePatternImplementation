/**
 * Class representing the first state S3.
 */

public class S3 implements State {

    private static S3 state3;

    public synchronized static S3 getInstance() {
        if (state3 == null) {
            state3 = new S3();
        }
        return state3;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {
//        System.out.println("Entered the function in State 3 Successfully!!");
//        System.out.println("Input received at State 3 is " + input);
//        calculator.changeState(S4.getInstance());

        int c = Character.getNumericValue(input);
        if (c > 0) {
            calculator.updateN(c);
            calculator.changeState(S5.getInstance());
        } else
            System.out.println("Error in input of State 3");
    }
}
