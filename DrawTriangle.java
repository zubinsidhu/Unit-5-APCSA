import java.util.Scanner;
public class DrawTriangle {

	public static void main(String[] args) {
		System.out.println("*** Triangle ***");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = input.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		input.close();
	}

}
