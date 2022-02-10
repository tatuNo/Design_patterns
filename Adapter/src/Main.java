public class Main {
	
	/**
	 * Voimanosto on kolmesta eri nostomuodosta koostuva kilpailulaji,
	 * jossa lasketaan jokaisen nostomuodon maksimisuoritukset yhteen.
	 * Parhaimman yhteistuloksen saavuttanut kilpailija voittaa. 
	 * Voimanoston kolme nostomuotoa ovat jalkakyykky, penkkipunnerrus ja maastaveto
	 * 
	 * Ongelma : Sean on yhdysvaltalainen, joten hänen tuloksensa ovat paunoina,
	 * kun taas Martin tulokset ovat kilogrammoina. Jotta tulokset olisivat vertailukelpoiset
	 * ja oikea voittaja saataisiin julistetuttua, käytetään apuna adapteria, joka 
	 * muuttaa Seanin tuloksen kilogrammoiksi.
	 */

	public static void main(String[] args) {

		Voimanostaja nostajaUS = new Nostaja("Sean", 480, 320, 540); // 607,5kg
		Voimanostaja nostajaEU = new Nostaja("Martti", 232.5, 155, 260); // 647,5kg
		
		Voimanostaja winner = julistaVoittaja(nostajaUS,nostajaEU);
		
		System.out.println("Voittaja ennen adapteria: " + winner);
		
		EUtulosAdapter nostajaUSkiloina = new EUtulosAdapter(nostajaUS);
		
		winner = julistaVoittaja(nostajaUSkiloina,nostajaEU);
		
		System.out.println("Voittaja adapterin käsittelyn jälkeen: " + winner);
	}
	
	private static Voimanostaja julistaVoittaja(Voimanostaja a, Voimanostaja b) {
		return a.getYhteistulos() > b.getYhteistulos() ? a : b;
	}
}
