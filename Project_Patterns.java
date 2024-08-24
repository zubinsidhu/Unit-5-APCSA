import java.util.Scanner;
public class Project_Patterns {

	public static void main(String[] args) {
		final int R_TRIANGLE_UP = 1;
		final int R_TRIANGLE_DOWN = 2;
		final int L_TRIANGLE_UP = 3;
		final int L_TRIANGLE_DOWN= 4;
		final int PYRAMID = 5;
		final int EXIT = 6;
		int choice;
		int size = 0;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Main Menu\n1: RightSide Triangle Up\n2: RightSide Triangle Down\n3: LeftSide Triangle Up"
					+ "\n4: LeftSide Triangle Down\n5: Pyramid\n6: Exit");
			System.out.println("Enter a choice: ");
			choice = input.nextInt();
			if (choice != 6) {
				System.out.print("Enter the Size of the Pattern: ");
				size = input.nextInt();
			}
			switch (choice) {
			case R_TRIANGLE_UP:
				for (int i = 1; i <= size; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			case R_TRIANGLE_DOWN:
				for (int i = size; i >= 1; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			case L_TRIANGLE_UP:
				for (int i = 1; i <= size; i++) {
					for (int j = size; j >= 1; j--) {
						System.out.print(j > i ? "  " : "* ");
					}
					System.out.println();
				}
				break;
			case L_TRIANGLE_DOWN:
				for (int i = 1; i <= size; i++) {
					for (int j = 1; j <= size; j++) {
						System.out.print(j < i ? "  " : "* ");
					}
					System.out.println();
				}
				break;
			case PYRAMID:
				for (int i = 1; i <= size; i++) {
					for (int j = 1; j <= size - i; j++) {
						System.out.print("  ");
					}
					for (int k = 1; k <= (2 * i - 1); k++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			case EXIT:
				System.out.println("End of Program");
				break;
			default: System.out.print("Invalid Input");
			input.close();
			}
		} while (choice != 6);
	}
}
