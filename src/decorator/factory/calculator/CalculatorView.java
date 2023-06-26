package decorator.factory.calculator;

import decorator.factory.calculator.factory.impl.ICalculableFactory;

import java.util.Scanner;

public class CalculatorView {
    private final ICalculableFactory calculableFactory;

    public CalculatorView(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("??????? ?????? ????????: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("??????? ??????? (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("??????? ?????? ????????: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("??????? ?????? ????????: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("????????? %d\n", result);
                    break;
                }
            }
            String cmd = prompt("??? ????????? (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
