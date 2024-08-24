import java.util.Scanner;
public class DisplayingPrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many prime numbers: ");
		int number_of_primes = input.nextInt();
		int count = 0;
		int n = 2;
		System.out.println("The first " + number_of_primes + " prime numbers: ");
		while (count != number_of_primes) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= n / 2; divisor++) {
				if (n % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				System.out.printf(count % 10 == 0 ? "%4d%n" : "%4d", n);
			}
			n++;
		}
		input.close();	
		
		
	}
	
}