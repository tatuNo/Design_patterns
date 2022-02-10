package mcdonalds;

import hampurilaisbuilder.HampurilaisBuilder;

public class McDonaldsBuilder implements HampurilaisBuilder {
	
	private BigMac hampurilainen;
	
	@Override
	public void luoUusiHampurilainen() {
		hampurilainen = new BigMac();
	}

	@Override
	public void lisaaSampylat() {
		hampurilainen.setSampyla(new Sampyla("Big mac sämpylä"));
	}

	@Override
	public void lisaaSalaatti() {
		hampurilainen.setSalaatti(new Salaatti("Rapeaa jäävuorisalaatti"));
	}

	@Override
	public void lisaaPihvit() {
		hampurilainen.setPihvi(new Pihvi("Kaksi 100% naudanliha pihviä"));
	}

	@Override
	public void lisaaMajoneesi() {
		hampurilainen.setMajoneesi(new Majoneesi("BigMac kastike"));
	}

	@Override
	public void lisaaJuusto() {
		hampurilainen.setJuusto(new Juusto("Cheddarsulatejuusto"));
	}

	public BigMac getHampurilainen() {
		return hampurilainen;
	}
}
