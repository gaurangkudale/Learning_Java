package org.autoevaluate;

import java.sql.SQLOutput;

public class FistClass {

    public static void main(String[] args) {
    int myscore = 40;
    int topscore = 90;
    int secondtopscore = 80;

    if (myscore <= topscore){
        System.out.println("\nYou paased the examination with score :" + myscore);
        }
    if (topscore>secondtopscore && topscore<100){
        System.out.println("The topscore " + topscore + " is Greater than "+ secondtopscore + " and less than 100");
    }
    boolean isCar = false;
    if (!isCar){
        System.out.println("This is wrong");
    }

    int a = 100;
    int b = 20;
     int max = (a > b) ? a :b ;
        System.out.println(max);
    }
}
