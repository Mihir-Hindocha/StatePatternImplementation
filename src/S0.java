/**
 * Class representing the first state S0.
 * */

public class S0 implements State {

    private static S0 state0;

    public synchronized static S0 getInstance(){
        if(state0 == null){
            state0 = new S0();
        }
        return state0;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {
//        System.out.println("Entered the function in State 0 Successfully!!");
//        System.out.println("Input received at State 0 is " + input);
        int c = Character.getNumericValue(input);
        if(c>0){
            calculator.updateN(c);
            calculator.changeState(S1.getInstance());
        }
        else
            System.out.println("Error in input of State 0");
    }
}
