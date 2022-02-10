package hampurilaisbuilder;
/**
 * Hampurilaisen rajapinta.
 * @author tatu_
 *
 */
public interface HampurilaisBuilder {
	/**
	 * Hampurilaisen luonti
	 */
	void luoUusiHampurilainen();
	/**
	 * Sampylan lisays
	 */
	void lisaaSampylat();
	/**
	 * Salaatin lisäys
	 */
	void lisaaSalaatti();
	/**
	 * Pihvin lisäys
	 */
	void lisaaPihvit();
	/**
	 * Majoneesin lisäys
	 */
	void lisaaMajoneesi();
	/**
	 * Juuston lisäys
	 */
	void lisaaJuusto();
	/**
	 * Palauttaa hampurilaisen
	 * @return hampurilainen
	 */
	Object getHampurilainen();
}
