package org.autoevaluate.ControlFlow;

public class SwitchStatment {
    public static void main(String[] args) {
        System.out.println("Month Is in the "+getQuater("June")  + " Queater" );
        int value = 1;
        switch (value) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            default -> System.out.println("default value is null");
        }
    }
    public static String getQuater(String month) {
        return switch (month) {
            case "Jan", "feb", "march" -> "1st";
            case "April", "may", "June" -> "2nd";
            case "july", "Aug", "sep" -> "3rd";
            case "oct", "nov", "des" -> "4th";
            default -> "bad";
        };
    }
}
