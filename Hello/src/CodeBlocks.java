public class CodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


    //Challenge
    //Create a method called displayHighScorePosition
    //it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
    //You should display the players name along with a message like " managed to get into position " and the position they got and a further message on " on the high score table".
    //
    //Create a 2nd method called calculatedHighScorePosition
    //it should be sent one argument only, the player score
    //it should return an int
    //the return data should be
    //1 if the score is > 1000
    //2 if the score is > 500 and < 1000
    //3 if the score is > 100 and < 500
    //4 in all other cases
    //call both methods and display the results of the following
    //a score of 1500, 900, 400, and 50

        int highScorePosition = calculateScorePosition(1500);
        displayScorePosition("Ern", highScorePosition);

        highScorePosition = calculateScorePosition(900);
        displayScorePosition("Niesha", highScorePosition);

        highScorePosition = calculateScorePosition(400);
        displayScorePosition("Tone", highScorePosition);

        highScorePosition = calculateScorePosition(50);
        displayScorePosition("Mike", highScorePosition);

        highScorePosition = calculateScorePosition(1000);
        displayScorePosition("Kenny", highScorePosition);

        highScorePosition = calculateScorePosition(500);
        displayScorePosition("Sam", highScorePosition);

        highScorePosition = calculateScorePosition(100);
        displayScorePosition("Bree", highScorePosition);
}
    public static void displayScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table ");
    }

    public static int calculateScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;

        int position = 4;// assuming position 4 will be returned

        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
}
