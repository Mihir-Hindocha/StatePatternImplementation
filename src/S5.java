/**
 * Class representing the first state S5.
 */

public class S5 implements State {

    private static S5 state5;

    public synchronized static S5 getInstance() {
        if (state5 == null) {
            state5 = new S5();
        }
        return state5;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {

        int c = Character.getNumericValue(input);
        if (c >= 0) {
            calculator.updateN(calculator.getN() * 10 + c);
            calculator.changeState(S5.getInstance());
        } else if (input == '+') {
            calculator.updateTotal(calculator.getTotal() - calculator.getN());
            calculator.changeState(S4.getInstance());
        } else if (input == '-') {
            calculator.updateTotal(calculator.getTotal() - calculator.getN());
            calculator.changeState(S3.getInstance());
        } else
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
    }
}
