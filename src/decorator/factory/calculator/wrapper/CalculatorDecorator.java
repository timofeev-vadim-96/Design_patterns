package decorator.factory.calculator.wrapper;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.logger.Loggerable;

public class CalculatorDecorator implements Calculable {
    private Calculable calc;
    private Loggerable logger;

    public CalculatorDecorator(Calculable calc, Loggerable logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("�������� " + getResult() + " � " + arg);
        Calculable result = calc.sum(arg);
        logger.log("���������: " + result.getResult());
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("������� " + getResult() + " � " + arg);
        Calculable result = calc.multi(arg);
        logger.log("���������: " + result.getResult());
        return result;
    }

    @Override
    public int getResult() {
        return calc.getResult();
    }
}
