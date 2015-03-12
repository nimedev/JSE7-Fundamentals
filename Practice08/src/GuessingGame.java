/**
 *
 * @author niconator
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomNum = 0;
        int guess;
        
        if (args.length == 0 || args[0] == "help") {
            System.out.println("Error");
        } else {
            randomNum = ((int)(Math.random()*5)+1);
            guess = Integer.parseInt(args[0]);
            if (guess < 1 || guess > 5) {
                System.out.println("Invalid argument");
            } else {
                if (guess == randomNum) {
                    System.out.println("Congratulations");
                } else {
                    System.out.println("Sorry, try again");
                }
            }
        }
    }
    
}
