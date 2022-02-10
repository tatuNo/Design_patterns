import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		TuoteFactory tehdas = RainbowFactory.getInstance();
		Jaatelo j = tehdas.luoJaatelo();
		Patonki p = tehdas.luoPatonki();
		System.out.println("Onko hyvää: " + j.onkoHyvaa() + ", hinta: " + j.hinta());
		System.out.println("Patongin maku: " + p.maku() + ", hinta: " + p.hinta());
	}
}

