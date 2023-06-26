package decorator.factory.calculator;

import decorator.factory.calculator.factory.CalculableFactoryWithLoggs;
import decorator.factory.calculator.factory.impl.ICalculableFactory;

// ������� ����������� ��������, ��� ������ Calculator. ����� Calculator �� ������ ���������.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactoryWithLoggs();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();
    }
}
