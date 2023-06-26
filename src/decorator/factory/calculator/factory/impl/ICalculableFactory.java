package decorator.factory.calculator.factory.impl;

import decorator.factory.calculator.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
