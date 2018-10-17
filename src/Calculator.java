/**
 * This class will implement the Arithmetic operations of + and - on the input positive numbers expression.
 */
class Calculator {
    /**
     * Stores the final value of the expression after evaluation.
     */
    private int total;
    /**
     * Stores the intermediate numbers being stored between different state transitions.
     */
    private int n;
    /**
     * Stores the current state of execution.
     */
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

    /**
     * This method computes the given input string by passing each character for evaluation through different states.
     * The method then calls the checkAcceptance() to check if final state is valid and prints the answer through printTotal.
     */
    void calculate(String input) {

        setCurrentState(S0.getInstance()); //set initial state to state0
        int length = input.length();
        char inputArray[];
        inputArray = input.toCharArray();

        for (int i = 0; i < length; i++) {
            try {
                currentState.performOperation(this, inputArray[i]);
            } catch (NullPointerException e) {
                System.out.println("Null value is received as Input!!");
            }
        }
        checkAcceptance(getCurrentState());
        printTotal();
    }

    /**
     * This method checks if the evaluation ends in one of the final states of the State Diagram
     * and complete other necessary operations.
     */
    void checkAcceptance(State currentState) {
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
    }
}
