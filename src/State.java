/**
 * This interface will be implemented by the various different states.
 * */

public interface State {
    void performOperation(Calculator calculator, char input);
}
