/**
 * A Singleton class representing the first state S2.
 * Only one instance of the class is required for the evaluation of the expression.
 */
public class S2 implements State {

    private static S2 state2;

    /**
     * Method to return an existing instance or create one if not present
     */
    public synchronized static S2 getInstance() {
        if (state2 == null) {
            state2 = new S2();
        }
        return state2;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {

        int c = Character.getNumericValue(input);
        //For numbers between 0-9
        if (c >= 0) {
            calculator.updateN(calculator.getN() * 10 + c);
            calculator.changeState(S2.getInstance());
        } else if (input == '+') {
            calculator.updateTotal(calculator.getN());
            calculator.changeState(S4.getInstance());
        } else if (input == '-') {
            calculator.updateTotal(calculator.getN());
            calculator.changeState(S3.getInstance());
        } else
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
    }
}
