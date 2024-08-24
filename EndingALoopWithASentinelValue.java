import java.util.*;
public class EndingALoopWithASentinelValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int sum = 0;
		do {
			System.out.print("Enter an integer. Input ends with 0: ");
			n = input.nextInt();
			sum += n;
		} while (n != 0);
		input.close();
		System.out.println("End of data. Sum: " + sum);
	}

}
