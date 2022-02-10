
public class Pizzapohja implements Pizza {

	@Override
	public double getHinta() {
		return 2.5;
	}

	@Override
	public String lisaa() {
		return "Pizza, jossa: ";
	}

}
