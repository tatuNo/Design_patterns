
public class Naytonohjain implements Laiteosa {
	
	private final int hinta = 25;
	
	@Override
	public int getHinta() {
		return hinta;
	}
	
	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException
		("Näytonohjaimeen ei voi lisätä osia");
	}

	@Override
	public void poistaOsa(Laiteosa osa) {
		throw new RuntimeException
		("Näytönohjaimesta ei voi poistaa osia");
	}


}
