import java.util.Iterator;

public class SaieB extends Thread {
	
	private Iterator<Integer> iterator;
	
	public SaieB(Iterator<Integer> iterator) {
		this.iterator = iterator;
	}
	
	@Override
	public void run () {
		while(iterator.hasNext()) {
			synchronized(iterator) {
				System.out.println(this + " " + iterator.next());
				iterator.notify();
				try {
					iterator.wait();
				} catch(Exception e)  {
					e.printStackTrace();
				}
		iterator.notifyAll();
			}
		}
	}
}
