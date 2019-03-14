package com.sachinbhagat;

public class CalculateAndDisplayScore {

    public static void main(String[] args) {
        int position = calculateHighScorePosition(11000);
        diaplayHighScorePosition("Sachin", position);

        position = calculateHighScorePosition(900);
        diaplayHighScorePosition("Pallavi", position);

        position = calculateHighScorePosition(400);
        diaplayHighScorePosition("Sayali", position);

        position = calculateHighScorePosition(90);
        diaplayHighScorePosition("Shivani", position);
    }

    public static int calculateHighScorePosition(int playerScore){
      /*  if(playerScore > 1000){
            return 1;
        }else if(playerScore <= 1000 && playerScore > 500){
            return 2;
        }else  if(playerScore <= 500 && playerScore > 100 ){
            return 3;
        }else {
            return 4;
        }*/

       int position = 4;
       if(playerScore >= 1000){
           position = 1;
       }else  if (playerScore >= 500){
           position = 2;
       }else if( playerScore >= 100) {
           position = 3;
       }
       return position;
    }

    public static void diaplayHighScorePosition(String playername, int highScoreposition){
        System.out.println(playername + " Managed to get position " + highScoreposition + " in High Score Table" );
    }
}
