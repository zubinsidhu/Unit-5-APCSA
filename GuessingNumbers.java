import java.util.*;
public class GuessingNumbers {

	public static void main(String[] args) {
		int n = (int)(Math.random()*101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100: ");
		int guess = -1;
		while (n != guess) {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();
			
			if (guess == n) {
				System.out.println("Yes! The number is " + n);
			}
			else if (guess > n) {
				System.out.println("Too high.");
			}
			else {
				System.out.println("Too low.");
			}
		}
		input.close();
	}
}
