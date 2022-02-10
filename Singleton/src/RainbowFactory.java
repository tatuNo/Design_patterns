
public class RainbowFactory extends TuoteFactory {
		
	private static RainbowFactory INSTANCE = null;
	private RainbowFactory() {}
	
	@Override
	public Patonki luoPatonki() {
		return new RainbowPatonki();
	}
	
	@Override
	public Jaatelo luoJaatelo() {
		return new RainbowJaatelo();
	}

	public static TuoteFactory getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new RainbowFactory();
		}
		return INSTANCE;
	}

}
