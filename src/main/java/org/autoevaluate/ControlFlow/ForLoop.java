package org.autoevaluate.ControlFlow;

public class ForLoop {
    public static void main(String[] args) {
        for (double rate = 2; rate <= 5 ; rate++) {
            //System.out.println("10,000 at " + rate + "% intrest = " + calculateIntrest(10000.0, rate));
        }
        for (double i = 7.5; i <= 10; i = i + 0.25) {
            System.out.println("10,000 at " + i + "% intrest = $" + calculateIntrest(100.0, i));
            if (i == 8.5){
                break;
            }
        }

    }
    public static double calculateIntrest(double amount, double intrestRate){
        return (amount * (intrestRate / 100));
    }
}
