package com.company;

public class Main {

    public static void main(String[] args) {
        int score1 = 1500 ;
        String player1 = " mad ";
        int score2 = 900 ;
        String player2 = " krit ";
        int score3 = 400 ;
        String player3 = " shubham ";
        int score4 = 50 ;
        String player4 = " abhay ";
        int postision1 = calculateHighScorePosition(score1) ;
        int postision2 = calculateHighScorePosition(score2) ;
        int postision3 = calculateHighScorePosition(score3) ;
        int postision4 = calculateHighScorePosition(score4) ;
        displayHighScorePosition(player1,postision1);
        displayHighScorePosition(player2,postision2);
        displayHighScorePosition(player3,postision3);
        displayHighScorePosition(player4,postision4);
    }
    public static void displayHighScorePosition (String playersName , int position ){
        System.out.println(playersName+ " managed to get into the position " + position + " on the high score table");

    }
    public static int calculateHighScorePosition(int playerScore){
        int position = (playerScore>1000) ? 1 : (playerScore>500) ? 2 : (playerScore>100) ? 3 : 4 ;

        return position;
    }
}
