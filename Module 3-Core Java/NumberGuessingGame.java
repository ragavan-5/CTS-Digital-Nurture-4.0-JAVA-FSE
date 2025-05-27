import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        int guess = 0;
        while(guess != num) {
            guess = sc.nextInt();
            if(guess < num) System.out.println("Too low");
            else if(guess > num) System.out.println("Too high");
            else System.out.println("Correct");
        }
    }
}

