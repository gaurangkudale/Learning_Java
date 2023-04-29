package org.autoevaluate.codingexercies;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        else if (kilometersPerHour > 0){
            double mile = 1.609;
            //double total_miles = mile * kilometersPerHour;
            kilometersPerHour = Math.round(kilometersPerHour / mile);
        }
        return (long) kilometersPerHour;
    }
    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            long yy = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + yy + " mi/h");
        }
    }
}