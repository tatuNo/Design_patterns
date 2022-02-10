
public class Charmander extends Kehitysmuoto {
	
	private static Charmander INSTANCE = null;
	private final int T = 10;
	private final int P = 7;
	private final int L = 4;
	
	private Charmander () {}
	
	public static Kehitysmuoto getInstance () {
		if(INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
	}

	@Override
	void kehity(Pelihahmo p) {
		System.out.println("Charmander kehittyy charmeleoniksi");
		p.setPokemon(Charmeleon.getInstance());
	}

	@Override
	void taistele(Pelihahmo p) {
		System.out.println("Charmander taistelee ja ansaitsee " + T + "xp");
		p.setXp(T);
		tarkastaXp(p);
	}

	@Override
	void puolusta(Pelihahmo p) {
		System.out.println("Charmander puolustautuu ja ansaitsee " + P + "xp");
		p.setXp(P);
		tarkastaXp(p);
	}

	@Override
	void liiku(Pelihahmo p) {
		System.out.println("Charmander liikkuu ja ansaitsee " + L + "xp");
		p.setXp(L);
		tarkastaXp(p);
	}

	@Override
	void tarkastaXp(Pelihahmo p) {
		if(p.getXp() > 100)
			kehity(p);
	}
}
