
public class Levykeasema implements Laiteosa {

	private final int hinta = 7;
	
	@Override
	public int getHinta() {
		return hinta;
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException
		("Levykeasemaan ei voi lisätä osia");
	}

	@Override
	public void poistaOsa(Laiteosa osa) {
		throw new RuntimeException
		("Levykeasemasta ei voi poistaa osia");
	}

}
