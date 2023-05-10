package org.autoevaluate.codingexercies;

public class DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces(double par1, double par2){
           int int_par1 = (int) par1 * 1000;
           int int_par2 = (int) par2 * 1000;

            if (int_par1 == int_par2){
                return true;
            }
            else
            return false;
        }
}
