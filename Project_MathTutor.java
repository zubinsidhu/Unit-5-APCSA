import java.util.Scanner;
public class Project_MathTutor {

	public static void main(String[] args) {
		final int ADDITION = 1;
		final int SUBTRACTION = 2;
		final int MULTIPLICATION = 3;
		final int DIVISION = 4;
		final int EXIT = 5;
		int choice;
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Main Menu\n1: Addition\n2: Subtraction\n3: Multiplication"
					+ "\n4: Division\n5: Exit\n");
			System.out.print("Enter a choice: ");
			choice = input.nextInt();
			int n1 = (int)(Math.random() * 10 + 1);
			int n2 = (int)(Math.random() * 10 + 1);
			if (n1 < n2) {
				int temp = n1;
				n1 = n2;
				n2 = temp;
			}
			int user_answer;
			int answer;
			switch(choice) {
			case ADDITION:
				System.out.print(n1 + " + " + n2 + " = ");
				user_answer = input.nextInt();
				answer = (n1 + n2);
				if (answer == user_answer) {
					System.out.println("Correct!\n");
				}
				else {
					System.out.println("Incorrect! Answer is " + answer + "\n");
				}
				break;
			case SUBTRACTION:
				System.out.print(n1 + " - " + n2 + " = ");
				user_answer = input.nextInt();
				answer = (n1 - n2);
				if (answer == user_answer) {
					System.out.println("Correct!");
				}
				else {
					System.out.println("Incorrect! Answer is " + answer + "\n");
				}
				break;
			case MULTIPLICATION:
				System.out.print(n1 + " * " + n2 + " = ");
				user_answer = input.nextInt();
				answer = (n1 * n2);
				if (answer == user_answer) {
					System.out.println("Correct!");
				}
				else {
					System.out.println("Incorrect! Answer is " + answer + "\n");
				}
				break;
			case DIVISION:
				System.out.print(n1 + " / " + n2 + " = ");
				user_answer = input.nextInt();
				answer = (n1 / n2);
				if (answer == user_answer) {
					System.out.println("Correct!");
				}
				else {
					System.out.println("Incorrect! Answer is " + answer + "\n");
				}
				break;
			case EXIT:
				System.out.println("End of program.");
				break;
			default: System.out.println("Invalid input.");
			input.close();
			}
		} while (choice != 5);
	}

}