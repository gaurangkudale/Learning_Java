package org.autoevaluate.codingexercies;

public class LeapYear {

    public static void main(String[] args) {
        isLeapYear(1924);
        isLeapYear(1800);
    }
    public static boolean isLeapYear(int year) {

        if ((year >=1) && (year <= 9999)){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }

        else {
            return false;
        }
        return false;
    }
}
