public class CodeBlocks {

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 4000;
        int levelCompleded = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");//{} is optional if you only have one line of code but highly recommended for readability.
        }
    }
}
