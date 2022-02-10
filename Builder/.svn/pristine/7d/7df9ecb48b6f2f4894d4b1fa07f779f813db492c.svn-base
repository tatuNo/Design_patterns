import hampurilaisbuilder.HampurilaisBuilder;
import mcdonalds.BigMac;
import mcdonalds.McDonaldsBuilder;
import ohjaaja.HampurilaisenTekija;

public class McDonaldsinAsiakas {

	public static void main(String[] args) {
		HampurilaisenTekija tekija = new HampurilaisenTekija();
		HampurilaisBuilder mcdonalds = new McDonaldsBuilder();
		
		tekija.setRavintola(mcdonalds);
		tekija.teeHampurilainen();
		
		BigMac hamppari = (BigMac) mcdonalds.getHampurilainen();
		System.out.println(hamppari);	
	}
}
