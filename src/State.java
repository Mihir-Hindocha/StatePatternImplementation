/**
 * This interface will be implemented by the various different state classes.
 */

public interface State {
    void performOperation(Calculator calculator, char input);
}
