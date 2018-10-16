/**
 * Class representing the first state S2.
 * */

public class S2 implements State {

    private static S2 state2;

    public synchronized static S2 getInstance(){
        if(state2 == null){
            state2 = new S2();
        }
        return state2;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {
        System.out.println("Entered the function in State 2 Successfully!!");
        System.out.println("Input received at State 2 is " + input);
        calculator.changeState(S3.getInstance());
    }
}
