import java.util.Iterator;

public class Saie extends Thread {
	
	private Iterator<Integer> iterator;
	
	public Saie(Iterator<Integer> iterator) {
		this.iterator = iterator;
	}
	
	@Override
	public void run () {
		while(iterator.hasNext()) {
			System.out.println(this + " " + iterator.next());
		}
	}
}
