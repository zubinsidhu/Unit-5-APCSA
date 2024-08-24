import java.util.*;
public class RepeatAdditionUntilCorrect {

	public static void main(String[] args) {
		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + n1 + " + " + n2 + "? ");
		int answer = input.nextInt();
		
		while (answer != n1 + n2) {
			System.out.println("Incorrect answer, try again.\n" + "What is " + n1 + " + " + n2 + "?");
			answer = input.nextInt();
		}
		input.close();
		System.out.println("Correct!");
	}
}
