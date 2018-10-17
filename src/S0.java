/**
 * Class representing the first state S0.
 */

public class S0 implements State {

    private static S0 state0;

    public synchronized static S0 getInstance() {
        if (state0 == null) {
            state0 = new S0();
        }
        return state0;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {

        int c = Character.getNumericValue(input);
        if (c > 0) {
            calculator.updateN(c);
            calculator.changeState(S1.getInstance());
        } else
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
    }
}
