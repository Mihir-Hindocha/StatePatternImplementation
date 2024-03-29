/**
 * A Singleton class representing the first state S6.
 * Only one instance of the class is required for the evaluation of the expression.
 */

public class S6 implements State {

    private static S6 state6;

    /**
     * Method to return an existing instance or create one if not present
     */
    public synchronized static S6 getInstance() {
        if (state6 == null) {
            state6 = new S6();
        }
        return state6;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {

        int c = Character.getNumericValue(input);
        //For numbers between 0-9
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
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
    }
}
