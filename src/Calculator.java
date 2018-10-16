/**
 * This class will implement the Arithmetic operations of + and - on the input positive expressions.
 */

class Calculator {
    private int total;
    private int n;
    private int c;
    private State currentState;

    void changeState(State newState) {
        this.currentState = newState;
    }

    void updateN(int newN) {
        this.n = newN;
    }

     void updateTotal(int newValue) {
        this.total = newValue;
    }

     State getCurrentState() {
        return currentState;
    }

    private void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    void calculate(String input) {
        setCurrentState(new S0());

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

    }

}
