import java.util.Scanner;
public class DrawPyramid {

	public static void main(String[] args) {
		System.out.println("*** Pyramid ***");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = input.nextInt();
		for (int i = 1; i <= size; i++) {
			/*
			for (int j = i; j < size; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			*/
			for (int j = size; j >= 1; j--) {
				System.out.print(j > i ? " " : "* ");
			}
			System.out.println();
		}
		input.close();
	}

}
