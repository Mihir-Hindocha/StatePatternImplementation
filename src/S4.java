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

        int c = Character.getNumericValue(input);
        if (c > 0) {
            calculator.updateN(c);
            calculator.changeState(S6.getInstance());
        } else
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
    }
}
