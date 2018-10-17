/**
 * This class will implement the Arithmetic operations of + and - on the input positive expressions.
 */

class Calculator {

    private int total;
    private int n;
    private State currentState;

    void changeState(State newState) {
        currentState = newState;
    }

    void updateN(int newN) {
        n = newN;
    }

    public int getN() {
        return n;
    }

    void updateTotal(int newValue) {
        this.total = newValue;
    }

    public int getTotal() {
        return total;
    }

    public void printTotal() {
        System.out.println(getTotal());
    }

    State getCurrentState() {
        return currentState;
    }

    private void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    void calculate(String input) {
        setCurrentState(S0.getInstance());

        int length = input.length();
        char inputArray[];
        inputArray = input.toCharArray();

        for (int i = 0; i < length; i++) {
            try {
                currentState.performOperation(this, inputArray[i]);
            } catch (NullPointerException e) {
                System.out.println("Null Received in the Input!!");
            }
        }
        if (currentState.equals(S1.getInstance())) {
            updateTotal(getN());
        } else if (currentState.equals(S2.getInstance())) {
            updateTotal(getN());
        } else if (currentState.equals(S5.getInstance())) {
            updateTotal(getTotal() - getN());
        } else if (currentState.equals(S6.getInstance())) {
            updateTotal(getTotal() + getN());
        } else
            throw new java.lang.Error("Invalid input encountered. Please check and try again.");
        printTotal();
    }
}
