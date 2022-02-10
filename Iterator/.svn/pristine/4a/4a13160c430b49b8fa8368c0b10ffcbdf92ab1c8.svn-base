import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Collections.addAll(lista, 0,1,2,3,4,5);
		
		Iterator<Integer> iterator1 = lista.iterator();
		Iterator<Integer> iterator2 = lista.iterator();
		
		// A
		Saie saie1 = new Saie(iterator1);
		Saie saie2 = new Saie(iterator2);
		saie1.start();
		saie2.start();
		
		while(saie1.isAlive() || saie2.isAlive()) {
			try {
				saie1.join();
				saie2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("----------------- Säikeet kuolleet -------------------------");
		
		// B
		iterator1 = lista.iterator();
		SaieB saie4 = new SaieB(iterator1);
		SaieB saie5 = new SaieB(iterator1);
		saie4.start();
		saie5.start();
		
		while(saie4.isAlive() || saie5.isAlive()) {
			try {
				saie4.join();
				saie5.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("----------------- Säikeet kuolleet -------------------------");
		
		// C
		/** java.util.ConcurrentModificationException. The java. util. ConcurrentModificationException is 
		 * typically thrown when code attempts to modify a data 
		 * collection while that collection is actively in use, such as being iterated
		iterator1 = lista.iterator();
		Saie sai6 = new Saie(iterator1);
		sai6.start();
		lista.add(15);
		lista.add(12);
		*/
		
		// D
		iterator1 = lista.iterator();
		while(iterator1.hasNext()) {
			int i = iterator1.next();
			if(i == 4)
				iterator1.remove();
		}
		
		for(Integer i : lista) {
			System.out.println(i);
		}
	 }
}
