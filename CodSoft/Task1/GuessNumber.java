import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String args[]){
        System.out.println("Welcome to \"Guess Number\" Game");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int rounds = 0;

        while(true){
            int randomNum = random.nextInt(1,100);
            int limit = 10;
            int attepmts = 1;

            while (attepmts <= limit) {
                System.out.println("Guess the Right Number: ");
                int guess = sc.nextInt();
                if(guess == randomNum){
                    System.out.println("You guess the correct number in " + attepmts + " attempts.");
                    rounds++;
                    break;
                }
                else if(guess > randomNum){
                    System.out.println("Too high! Try again");
                }
                else{
                    System.out.println("Too low! Try again");
                }
                attepmts++;
                
            }
            if(attepmts > limit){
                System.out.println("You have reached maximun number of attempts.");
            }
            System.out.println("You have won "+ rounds + " rounds.");

            System.out.println("Do you want to play more(yes/no)");
            String ask = sc.next();
            if(!ask.equals("yes") && !ask.equals("Yes")){
                break;
            }

        }

        System.out.println("Thanks for Playing \"Guess Number\".");
        sc.close();

    }
    
}
