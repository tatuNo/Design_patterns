
public class PirkkaJaatelo implements Jaatelo {
	
	private final int HINTA = 2;
	
	@Override
	public boolean onkoHyvaa() {
		return false;
	}

	@Override
	public int hinta() {
		return HINTA;
	}

}
