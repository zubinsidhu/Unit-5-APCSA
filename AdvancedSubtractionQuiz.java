import java.util.*;
public class AdvancedSubtractionQuiz {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 5;
		int count = 0;
		int countCorrect = 0;
		Scanner input = new Scanner(System.in);
		String record = "";
		long timeStart = System.currentTimeMillis();
		while (count < NUMBER_OF_QUESTIONS) {
			int n1 = (int)(Math.random() * 10);
			int n2 = (int)(Math.random() * 10);
			String quiz = Math.max(n1, n2) + " - " + Math.min(n1,  n2) + " = ";
			System.out.print("What is " + quiz + "? ");
			int solution = Math.abs(n1 - n2);
			int answer = input.nextInt();
			if (answer == solution) {
				System.out.println("Correct.");
				countCorrect++;
			}
			else {
				System.out.println("Not Correct. " + quiz + solution);
			}
			record += "\n" + quiz + answer + (answer == solution ? ": Correct." : ":Not Correct.");
			count++;
		}
		input.close();
		long timeEnd = System.currentTimeMillis();
		long time = (timeEnd - timeStart) / 1000;
		System.out.println("-----------------------" + "\nEnd of Test. Test record: " + record + "\n"
				+"Number of correct answers: " + countCorrect + " out of " + NUMBER_OF_QUESTIONS + "\nTotal test time: " + time + " seconds");
	}

}
