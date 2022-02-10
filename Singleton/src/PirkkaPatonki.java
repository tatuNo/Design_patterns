
public class PirkkaPatonki implements Patonki {

	private final int HINTA = 3;
	
	@Override
	public String maku() {
		return "loistava";
	}

	@Override
	public int hinta() {
		return HINTA;
	}
	
}
