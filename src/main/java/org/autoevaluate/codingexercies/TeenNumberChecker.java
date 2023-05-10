package org.autoevaluate.codingexercies;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(18,18,18));
        System.out.println(hasTeen(8,1,1));
        System.out.println(isTeen(14));
    }
    public static boolean hasTeen(int a, int b, int c){
        if ((a < 13 || a >19) && (b < 13 || b >19) && (c < 13 || c > 19)){
            return false;
        }
        return true;
    }

    public static boolean isTeen(int x){
        if (x >= 13 && x <= 19 ){
            return true;
        }
        return false;
    }
}
