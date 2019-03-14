package com.sachinbhagat;

public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 8000;
        int levelcompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelcompleted, bonus);
        System.out.println("Your Final Score is " + highScore);


        int highscorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("sachin ", highscorePosition);

        highscorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("pallavi ", highscorePosition);

        highscorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("sayali ", highscorePosition);

        highscorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("shivani ", highscorePosition);


    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + "managed to get into position " + highScorePosition + " in high score table");

    }

    public static int calculateHighScorePosition(int playerScore){

        if(playerScore > 1000){
            return 1;
        }else if(playerScore > 500 && playerScore < 1000 ){
            return 2;
        }else if(playerScore > 100 && playerScore < 500 ){
            return 3;
        }else{
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }





}
