package org.autoevaluate.codingexercies;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,2));
    }
    public static boolean hasEqualSum(int par1, int par2, int par3){
        return  par1 + par2 == par3;
    }
}
