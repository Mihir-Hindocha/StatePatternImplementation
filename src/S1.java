/**
 * Class representing the second state S1.
 * */

public class S1 implements State {

    @Override
    public void performOperation(Calculator calculator, char input) {
        System.out.println(input);
        System.out.println("Entered the function in State 1 Successfully!!");
    }
}
