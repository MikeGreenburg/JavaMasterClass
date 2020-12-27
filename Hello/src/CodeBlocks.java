public class CodeBlocks {

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");//{} is optional if you only have one line of code but highly recommended for readability.
//        }

        if(gameOver == true) {//can be abbreviated as if(gameOver); is the same as if(gameOver -- true);
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        //challenge
        //Print out a second score on the screen with the following:
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //But make sure that the first printout above still displays as well

        //My solution
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        if(gameOver){
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("This is your new score " + finalScore);
        }

        //Tims solution
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        //True conditions
        if(condition){
            //if statement (block)
        } else {
            //else statement (block) only executes if the first condition is false!
        }

        int score = 6000;
        if (score >= 5000) {//1. expression result is true
            System.out.println("Your score was >= 5000");//2 execute line (code block)
        } else if (score < 1000 && score >= 500){
            System.out.println("Your score was < 1000 but >= 500");
        } else {
            System.out.println("Your score was < 500");
        }
        //3. jump here


        //False conditions
        int score = 800;
        if (score >= 5000){//1. expression result is false
            System.out.println("Your score was >= 500");
        } else if (score < 1000 && score >= 500){//2. true && true result is true
            System.out.println("Your score was < 1000 but >= 500");//3. execute line (code block)
        } else {
            System.out.println("Your score was < 500");
        }
        //4. jump here
    }
}
