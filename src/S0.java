/**
 * Class representing the first state S0.
 * */

public class S0 implements State {

    @Override
    public void performOperation(Calculator calculator, char input) {
        System.out.println(input);
        System.out.println("Entered the function in State 0 Successfully!!");
        calculator.changeState(new S1());
    }
}
