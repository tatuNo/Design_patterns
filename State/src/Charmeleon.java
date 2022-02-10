
public class Charmeleon extends Kehitysmuoto {
	
	private static Charmeleon INSTANCE = null;
	private final int T = 12;
	private final int P = 9;
	private final int L = 6;
	
	private Charmeleon () {}
	
	public static Kehitysmuoto getInstance () {
		if(INSTANCE == null) {
			INSTANCE = new Charmeleon();
		}
		return INSTANCE;
	}

	@Override
	void kehity(Pelihahmo p) {
		System.out.println("Charmeleon kehittyy charizardiksi");
		p.setPokemon(Charizard.getInstance());
	}

	@Override
	void taistele(Pelihahmo p) {
		System.out.println("Charmeleon taistelee ja ansaitsee " + T + "xp");
		p.setXp(T);
		tarkastaXp(p);
	}

	@Override
	void puolusta(Pelihahmo p) {
		System.out.println("Charmeleon puolustaa ja ansaitsee " + P + "xp");
		p.setXp(P);
		tarkastaXp(p);
	}

	@Override
	void liiku(Pelihahmo p) {
		System.out.println("Charmeleon liikkuu ja ansaitsee " + L + "xp");
		p.setXp(L);
		tarkastaXp(p);
	}

	@Override
	void tarkastaXp(Pelihahmo p) {
		if(p.getXp() > 200)
			kehity(p);
	}
}
