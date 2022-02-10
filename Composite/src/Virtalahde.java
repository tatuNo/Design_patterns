
public class Virtalahde implements Laiteosa {

	private final int hinta = 12;
	
	@Override
	public int getHinta() {
		return hinta;
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException
		("Virtalähteeseen ei voi lisätä osia");
	}

	@Override
	public void poistaOsa(Laiteosa osa) {
		throw new RuntimeException
		("Virtalähteestä ei voi poistaa osia");
	}

}
