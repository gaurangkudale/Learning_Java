package org.autoevaluate;

public class challenge {
    public static void main(String [] args) {
        double value1 = 20.00d;
        double value2 = 80.00d;

        double total = (value1 + value2) * 100.00d;
        System.out.println("Toal value is : " + total);
        double reminder = total % 40.00d;
        System.out.println("The reminder is : " + reminder);

        boolean var1 = (reminder == 0) ? true : false;
        System.out.println(var1);
        if (!var1){
            System.out.println("Got some reminder :" + reminder);
        }
    }
}
