package decorator.factory.calculator.factory.impl;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.Calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
