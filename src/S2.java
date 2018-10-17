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
//        System.out.println("Entered the function in State 2 Successfully!!");
//        System.out.println("Input received at State 2 is " + input);
        int c = Character.getNumericValue(input);
        if (c >= 0) {
            calculator.updateN(calculator.getN() * 10 + c);
            calculator.changeState(S2.getInstance());
        } else if (input == '+') {
            calculator.updateTotal(calculator.getN());
            calculator.changeState(S4.getInstance());
        } else if (input == '-') {
            calculator.updateTotal(calculator.getN());
            calculator.changeState(S3.getInstance());
        } else
            System.out.println("Error in input of State 2");
    }
}
