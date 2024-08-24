import java.util.*;
public class NestedLoopsMultiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x value of table: ");
		int x = input.nextInt();
		System.out.print("Enter y value of table: ");
		int y = input.nextInt();
		System.out.println("Multiplication Table");
		System.out.println("--------------------");
		for (int i = 1; i <= x; i++) {
			if (i < 10) {
				System.out.print(i + " | ");

			}
			else {
				System.out.print(i + "| ");
			}
			for (int n = 1; n <= y; n++) {
				System.out.printf("%4d", i * n);
			}
			System.out.println();
		}
		input.close();
	}

}
