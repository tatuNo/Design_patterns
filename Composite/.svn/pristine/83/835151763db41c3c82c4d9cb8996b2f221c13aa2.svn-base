import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
	
	private int hinta = 20;
	private List<Laiteosa> osat = new ArrayList<Laiteosa> ();

	@Override
	public int getHinta() {
		for(Laiteosa l : osat) {
			hinta += l.getHinta();
		}
		return hinta;
	}
	
	public void lisaaOsa (Laiteosa osa) {
		osat.add(osa);
	}
	
	public void poistaOsa (Laiteosa osa) {
		osat.remove(osa);
	}
}
