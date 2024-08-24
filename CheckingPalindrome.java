import java.util.Scanner;
public class CheckingPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		input.close();
		int low = 0;
		int high = s.length() - 1;
		boolean isPalindrome = true;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		System.out.print(s + " is " + (isPalindrome ? "a Palindrome" : "not a Palindrome"));
	}

}
