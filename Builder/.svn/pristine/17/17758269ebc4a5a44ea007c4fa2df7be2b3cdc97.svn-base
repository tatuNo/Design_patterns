import hampurilaisbuilder.HampurilaisBuilder;
import hesburger.HesburgerBuilder;
import hesburger.MegaHampurilainen;
import ohjaaja.HampurilaisenTekija;

public class HesburgerinAsiakas {

	public static void main(String[] args) {
		HampurilaisenTekija tekija = new HampurilaisenTekija();
		HampurilaisBuilder hesburger = new HesburgerBuilder();
		
		tekija.setRavintola(hesburger);
		tekija.teeHampurilainen();
		
		MegaHampurilainen hamppari = (MegaHampurilainen) hesburger.getHampurilainen();
		System.out.println(hamppari);	
	}
}
