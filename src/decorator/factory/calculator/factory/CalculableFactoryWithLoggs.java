package decorator.factory.calculator.factory;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.Calculator;
import decorator.factory.calculator.factory.impl.ICalculableFactory;
import decorator.factory.calculator.logger.impl.Logger;
import decorator.factory.calculator.wrapper.CalculatorDecorator;

public class CalculableFactoryWithLoggs implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorDecorator(new Calculator(primaryArg), new Logger());
    }
}
