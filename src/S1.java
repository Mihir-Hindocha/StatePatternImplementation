/**
 * Class representing the second state S1.
 * */

public class S1 implements State {

    private static S1 state1;

    public synchronized static S1 getInstance(){
        if(state1 == null){
            state1 = new S1();
        }
        return state1;
    }
    @Override
    public void performOperation(Calculator calculator, char input) {
        System.out.println("Entered the function in State 1 Successfully!!");
        System.out.println("Input received at State 1 is " + input);
        calculator.changeState(S2.getInstance());
    }
}
