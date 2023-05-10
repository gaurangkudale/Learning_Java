package org.autoevaluate.codingexercies;

public class BarkingDog {
    public static void main(String [] args){
        shouldWakeUp(true, 2);
        shouldWakeUp(true, -1);
    }

//    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        if (hourOfDay >= 0 && hourOfDay <= 23){
//            return !barking || hourOfDay > 8;
//        }
//        else {
//            System.out.println(!barking);
//        }
//        return true;
//    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
        return true;
    }
}
