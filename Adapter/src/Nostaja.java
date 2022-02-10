
public class Nostaja implements Voimanostaja {
	
	private double kyykky;
	private double penkki;
	private double veto;
	private String nimi;
	
	public Nostaja(String nimi, double kyykky, double penkki, double veto) {
		this.nimi = nimi;
		this.kyykky = kyykky;
		this.penkki = penkki;
		this.veto = veto;
	}

	@Override
	public double getKyykkytulos() {
		return kyykky;
	}

	@Override
	public double getPenkkiTulos() {
		return penkki;
	}

	@Override
	public double getVetoTulos() {
		return veto;
	}

	@Override
	public double getYhteistulos() {
		return kyykky + penkki + veto;
	}
	
	@Override
	public String toString () {
		return nimi;
	}
}
