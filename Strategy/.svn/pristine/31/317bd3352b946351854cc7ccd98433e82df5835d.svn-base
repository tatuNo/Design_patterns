import java.util.Random;

public class RandomArray {

	private Random r;
	private int [] array;
	private SortingStrategy strategy;
	
	public RandomArray(SortingStrategy strategy, int arraySize) {
		this.r = new Random();
		this.strategy = strategy;
		this.array = new int[arraySize];
	}

	public void generateArray() {
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(1000);
			System.out.print(array[i] + " ");
			if (i>0 && i%40==0)
	            System.out.println();
		}
		System.out.println();
	}
	
	public void setStrategy (SortingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void sortArray () {
		strategy.sortAndCountTime(array);
	}
}
