
public class Main {

	public static void main(String[] args) {
		RandomArray r = new RandomArray(new BubbleSort(), 30000);
		r.generateArray();
		r.sortArray();
		
		r.setStrategy(new SelectionSort());
		r.generateArray();
		r.sortArray();
		
		r.setStrategy(new InsertionSort());
		r.generateArray();
		r.sortArray();
		
		System.out.println("Kiitos hei");
	}
}
