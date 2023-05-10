package org.autoevaluate.MethodOverLoading;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }
        public static boolean isCatPlaying(boolean summer, int temperature){
            if (temperature < 25){
                return false;
            }
            else if (temperature < 45 && temperature > 25 ){
                return true;
            }
             else if (!summer && temperature <= 35) {
                return true;
            }

            return false;
        }
}
