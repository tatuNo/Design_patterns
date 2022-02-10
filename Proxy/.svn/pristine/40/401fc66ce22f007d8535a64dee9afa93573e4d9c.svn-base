import java.util.ArrayList;
import java.util.List;

public class ProxyExample {

	/**
	 * Test method
	 */
	public static void main(final String[] arguments) {
		List<Image> photogallery = new ArrayList<Image>();
		
		photogallery.add(new ProxyImage("kissa.jpg", "söpö kissa"));
		photogallery.add(new ProxyImage("koira.jpg", "iso koira"));
		photogallery.add(new ProxyImage("ahven.jpg", "kilonen ahven"));
		photogallery.add(new ProxyImage("possu.jpg", "pulska possu"));
		photogallery.add(new ProxyImage("karhu.jpg", "pelottava karhu"));
		
		
		System.out.print("Photogallery contains: ");
		for(Image i : photogallery) {
			System.out.print(i.showData() + "\t");
		}
		
		System.out.print("\n");
		
		for(Image i : photogallery) {
			i.displayImage();
		}
	}
}

