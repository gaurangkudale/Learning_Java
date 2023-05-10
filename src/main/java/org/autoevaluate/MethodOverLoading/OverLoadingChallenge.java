package org.autoevaluate.MethodOverLoading;

public class OverLoadingChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(- 65,45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }
    public static double convertToCentimeters(int inches){

        return (double) inches * 2.54;
    }
    public static double convertToCentimeters(int hight_in_feet, int hight_in_inches){
        int total_inches = (12 * hight_in_feet) + hight_in_inches;
        double result = convertToCentimeters(total_inches);
        return result;
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid data for seconds " + seconds + " it must be positive";
        }
        int minuets = seconds / 60;

        return getDurationString(seconds / 60 ,seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes <= 0){
            return "Invalid data for minutes " + minutes + " it must be positive";
        }
        if(seconds <= 0 || seconds >= 59){
            return "Invalid data for seconds " + seconds + " must be between 0 and 59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
    }

}
