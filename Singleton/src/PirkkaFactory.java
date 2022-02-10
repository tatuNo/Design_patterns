import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PirkkaFactory extends TuoteFactory {
	
	private static PirkkaFactory INSTANCE = null;
	private PirkkaFactory () {}
	
	@Override
	public Patonki luoPatonki() {
		return new PirkkaPatonki();
	}
	
	@Override
	public Jaatelo luoJaatelo() {
		return new PirkkaJaatelo();
	}

	public static TuoteFactory getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PirkkaFactory();
		}
		return INSTANCE;
	}
}
