/**
 * Class representing the first state S5.
 * */

public class S5 implements State {

    private static S5 state5;

    public synchronized static S5 getInstance(){
        if(state5 == null){
            state5 = new S5();
        }
        return state5;
    }

    @Override
    public void performOperation(Calculator calculator, char input) {
//        System.out.println("Entered the function in State 5 Successfully!!");
//        System.out.println("Input received at State 5 is " + input);
//        calculator.changeState(S6.getInstance());
        int c = Character.getNumericValue(input);
        if (c >= 0) {
            calculator.updateN(calculator.getN() * 10 + c);
            calculator.changeState(S5.getInstance());
        } else if (input == '+') {
            calculator.updateTotal(calculator.getTotal() - calculator.getN());
            calculator.changeState(S4.getInstance());
        } else if (input == '-') {
            calculator.updateTotal(calculator.getTotal() - calculator.getN());
            calculator.changeState(S3.getInstance());
        } else
            System.out.println("Error in input of State 5");
    }
}
