/**
 * A Singleton class representing the first state S3.
 * Only one instance of the class is required for the evaluation of the expression.
 */
public class S3 implements State {

    private static S3 state3;

    /**
     * Method to return an existing instance or create one if not present
     */
    public synchronized static S3 getInstance() {
        if (state3 == null) {
            state3 = new S3();
        }
        return state3;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {

        int c = Character.getNumericValue(input);
        //For numbers between 1-9
        if (c > 0) {
            calculator.updateN(c);
            calculator.changeState(S5.getInstance());
        } else
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
    }
}
