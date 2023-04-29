package org.autoevaluate.codingexercies;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            int megabytes = (kiloBytes / 1024);
            int total_kb = megabytes * 1024;
            int remaining_kb = kiloBytes - total_kb;

            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remaining_kb + " KB");
        }
    }
}
