import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        final int MAX_NUMBER = 10000;
        final int NUMBER_OF_ATTEMPTS = 14;
        Scanner scanner = new Scanner(System.in);

        int randomNum = (int) (Math.random() * MAX_NUMBER); // create a 4 digit random number between 0 to 9999
         
        while (randomNum < 1000) {
            randomNum = (int) (Math.random() * MAX_NUMBER); // create a 4 digit random number between
        }
        System.out.printf("Welcome to 4 digit number guessing game,You have %d attempts.%n", NUMBER_OF_ATTEMPTS);

        int chances = 0;

        // while loop to give 14 timess chance.
        while (chances < NUMBER_OF_ATTEMPTS) {

            System.out.print("Guess the four digit number: ");
            Integer guess = scanner.nextInt();

            if (guess > randomNum) {
                System.out.println("Guessed number is Bigger than secret number!");
            } else if (guess < randomNum) {
                System.out.println("Guessed number is smaller than secret number!");
            }

            else {
                System.err.println("Congratulation you won the game!");
                break;
            }

            chances++;

        }
        
        if (chances == NUMBER_OF_ATTEMPTS) {
            System.out.printf("You had %d  wrong attempt ,you lose the game.%n ", NUMBER_OF_ATTEMPTS);

            System.err.println("So the secret number is " + randomNum);

        }

    }

}
