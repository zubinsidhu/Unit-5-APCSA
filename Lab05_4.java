import java.util.Scanner;
public class Lab05_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amoount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberYears = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		input.close();
		
		double monthlyInterestRate = annualInterestRate / 12;
		int numOfMonthlyPayment = numberYears * 12;
		double monthlyPayment = (loanAmount * monthlyInterestRate) / 1 - (1 / (1 + Math.pow(1 + monthlyInterestRate, numOfMonthlyPayment)));
		double totalPayment = monthlyPayment * numOfMonthlyPayment;
		
		System.out.printf("Loan Amount: $%.2f\n" + "Number of Years to Pay: %d\n" + "Annual Interest Rate: %.2f\n" + "Monthly Payment: $%.2f\n" + "Total Payment: $%.2f\n", loanAmount, numberYears, annualInterestRate, monthlyPayment, totalPayment);
		double principal, interest;
		double balance = loanAmount;
		
		System.out.printf("%15s%15s%15s%15s", "Payment#", "Interest $", "Principal $", "Balance $");
		for (int i = 0; i <= numOfMonthlyPayment; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance -= principal;
			System.out.printf("%15d%15.2f%15.2f%15.2f\n", i, interest, principal, balance);
		}
	}
	

}
