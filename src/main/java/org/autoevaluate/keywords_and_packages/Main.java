package org.autoevaluate.keywords_and_packages;

public class Main {
    public static void main(String[] args) {
        int score1 = GameScore(3000, 5, 3);

        System.out.println(claculateHighScorePosition(1500));
        System.out.println(claculateHighScorePosition(1000));
        System.out.println(claculateHighScorePosition(500));
        System.out.println(claculateHighScorePosition(100));
        System.out.println(claculateHighScorePosition(25));

    }

    public static int GameScore(int score, int levelcompleted, int bonus) {
        boolean game_over = true;
        int finalscore = score;

        if (game_over) {
            finalscore = finalscore + (levelcompleted * bonus);
        }
        return finalscore;
    }

   public static int claculateHighScorePosition(int players_score){
        int possition = 4;
        if (players_score >= 1000){
           return possition = 1;
        }
        if (players_score >=500 ){
            return possition = 2;
        }
        if (players_score >= 100){
           return possition = 3;
        }
        return possition;
   }

    public static boolean isTooYoung(int age) {
        boolean result = false;
        if (age > 21) {
            result = true;
        }
        return result;
    }
}