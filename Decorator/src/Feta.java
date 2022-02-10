
public class Feta extends Tayte {
	
	public Feta(Pizza p) {
		super(p);
	}

	@Override
	public double getHinta() {
		return super.getHinta() + 1.2;
	}

	@Override
	public String lisaa() {
		return super.lisaa() + "feta ";
	}

}
