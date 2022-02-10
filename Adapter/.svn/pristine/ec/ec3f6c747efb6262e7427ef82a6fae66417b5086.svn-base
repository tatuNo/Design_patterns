
public class EUtulosAdapter implements Voimanostaja {
	
	private Voimanostaja nostaja;
	
	public EUtulosAdapter (Voimanostaja nostaja) {
		this.nostaja = nostaja;
	}

	@Override
	public double getKyykkytulos() {
		return paunatKiloiksi(nostaja.getKyykkytulos());
	}

	@Override
	public double getPenkkiTulos() {
		return paunatKiloiksi(nostaja.getPenkkiTulos());
	}

	@Override
	public double getVetoTulos() {
		return paunatKiloiksi(nostaja.getVetoTulos());
	}

	@Override
	public double getYhteistulos() {
		return paunatKiloiksi(nostaja.getYhteistulos());
	}
	
	@Override
	public String toString() {
		return nostaja.toString();
	}
	
	private double paunatKiloiksi (double lbs) {
		return Math.round(lbs / 2.20462082351605 * 0.4) / 0.4;
	}
}
