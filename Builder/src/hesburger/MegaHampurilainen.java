package hesburger;

import java.util.StringJoiner;

/**
 * Hesburgerin purilainen
 * @author tatu_
 *
 */
public class MegaHampurilainen {
	/** String joiner aineksille */
	private final transient StringJoiner ainekset = new StringJoiner(" ");
	/**
	 * Sets juusto
	 * @param juusto
	 */
	public void setJuusto(final String juusto) {
		ainekset.add(juusto);
	}
	/**
	 * Sets majoneesi
	 * @param majoneesi
	 */
	public void setMajoneesi(final String majoneesi) {
		ainekset.add(majoneesi);
	}
	/**
	 * Sets pihvi
	 * @param pihvi
	 */
	public void setPihvi(final String pihvi) {
		ainekset.add(pihvi);
	}
	/**
	 * Sets salaatti
	 * @param salaatti
	 */
	public void setSalaatti(final String salaatti) {
		ainekset.add(salaatti);
	}
	/**
	 * Set ssampyla
	 * @param sampyla
	 */
	public void setSampyla(final String sampyla) {
		ainekset.add(sampyla);
	}
	
	@Override
	public String toString() {
		return ainekset.toString();
	}
}
