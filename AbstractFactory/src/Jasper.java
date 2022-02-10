
public class Jasper {
	private Lippis lippis;
	private Farkut farkut;
	private Paita paita;
	private Kengat kengat;
	
	
	public Jasper() {
		
	}
	
	public Kengat getKengat() {
		return kengat;
	}
	public void setKengat(Kengat kengat) {
		this.kengat = kengat;
	}
	
	public Lippis getLippis() {
		return lippis;
	}
	public void setLippis(Lippis lippis) {
		this.lippis = lippis;
	}
	public Farkut getFarkut() {
		return farkut;
	}
	public void setFarkut(Farkut farkut) {
		this.farkut = farkut;
	}
	public Paita getPaita() {
		return paita;
	}
	public void setPaita(Paita paita) {
		this.paita = paita;
	}
	
	@Override
	public String toString () {
		return "Jasperilla päällä " + lippis + ", " + farkut + ", " + paita + " ja " + kengat;
	}
	
}
