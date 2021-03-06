package operation;

import calculatorException.CalculatorException;
import calculatorException.StackSizeException;
import calculatorException.WrongArgumentsException;

public class Add extends Operation{
    @Override
    public void doOperation(Context context, String[] args) throws CalculatorException {
        this.validateArgs(context, args);
        Double num1 = context.popStackElement();
        Double num2 = context.popStackElement();
        context.pushStackElement(num1 + num2);
    }

    @Override
    public void validateArgs(Context context, String[] args) throws CalculatorException {
        if (args != null && args.length != 0) {
            throw new WrongArgumentsException("Wrong amount of arguments for ADD-command.");
        }
        if (context.getStackSize() < 2){
            throw new StackSizeException("Too few elements on stack for ADD-command.");
        }
    }
}
