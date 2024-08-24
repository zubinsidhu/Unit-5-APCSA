
public class PredictFutureTuition {

	public static void main(String[] args) {
		double currentTuition = 10000;
		double rate = 0.07;
		double tuition = currentTuition;
		int years = 0;
		while (tuition < currentTuition * 2) {
			tuition *= rate;
			years++;
		}
		System.out.printf("Current tuition $%.2f will be doubled as $%.2f will be doubled as $%.2f in %d years", currentTuition, tuition, years);
	}

}
