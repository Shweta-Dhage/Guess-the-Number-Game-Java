import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int number = rn.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess the Number Game");
        System.out.println("Guess a number between 1 and 100");

        do {
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("It's Too High, Guess LOWER");
            }
            else if (guess < number) {
                System.out.println("It's Too Low, Guess HIGHER");
            }
            else {
                System.out.println("Congratulations! You guessed correctly ");
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != number);

        sc.close();
    }
}
