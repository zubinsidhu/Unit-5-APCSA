
public class Lab05_1 {

	public static void main(String[] args) {
		int count = 0;
		for (int c = '!';c <= '~';c++) {
			count++;
			System.out.print(count % 10 == 0 ? (char)(c) + "\n" : (char)(c) + " ");
		}
	}

}
