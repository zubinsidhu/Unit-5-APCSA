public class Lab05_3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j >= 1; j--) {
				if (i - j < 0) System.out.printf("%4s", " ");
				else System.out.printf("%4d", (int)(Math.pow(2, i-j)));
			}
			for (int k = 2; k <= 8; k++) {
				if (i - k < 0) System.out.printf("%4s", " ");
				else {
					System.out.printf("%4d", (int)(Math.pow(2, i-k)));
				}
			}
			System.out.println();
		}
	}

}