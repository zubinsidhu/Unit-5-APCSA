import java.util.*;
public class DecimalstoHexadecimals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int dec = input.nextInt();
		input.close();
		String hexString = "";
		while (dec > 0) {
			int hexValue = dec % 16;
			char hexChar = (hexValue < 10 && hexValue >= 0) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			hexString = hexChar + hexString;
			dec /= 16;
		}
		System.out.println("The hex number: " + hexString);
	}

}
