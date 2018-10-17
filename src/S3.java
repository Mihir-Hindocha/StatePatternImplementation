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

        int c = Character.getNumericValue(input);
        if (c > 0) {
            calculator.updateN(c);
            calculator.changeState(S5.getInstance());
        } else
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
    }
}
