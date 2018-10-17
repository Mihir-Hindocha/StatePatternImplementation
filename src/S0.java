/**
 * A Singleton class representing the first state S0.
 * Only one instance of the class is required for the evaluation of the expression.
 */

public class S0 implements State {

    private static S0 state0;

    /**
     * Method to return an existing instance or create one if not present
     */
    public synchronized static S0 getInstance() {
        if (state0 == null) {
            state0 = new S0();
        }
        return state0;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {

        int c = Character.getNumericValue(input);
        //For numbers between 1-9
        if (c > 0) {
            calculator.updateN(c);
            calculator.changeState(S1.getInstance());
        } else
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
    }
}
