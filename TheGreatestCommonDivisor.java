import java.util.Scanner;
public class TheGreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int n1 = input.nextInt();
		System.out.print("Enter Second Number: ");
		int n2 = input.nextInt();
		input.close();
		
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
			k++;
		}
		System.out.println("GCD for " + n1 + " and " + n2 + ": " + gcd);
	}

}
