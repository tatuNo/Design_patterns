
public class Charmander extends Kehitysmuoto {
	
	private static Charmander INSTANCE = null;
	private static final int T = 10;
	private static final int P = 7;
	private static final int L = 4;
	
	private Charmander () {}
	
	public static Kehitysmuoto getInstance () {
		if(INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
	}

	@Override
	void taistele(Pelihahmo p) {
		System.out.println("Charmander taistelee ja ansaitsee " + T + "xp");
		p.setXp(T);
	}

	@Override
	void puolusta(Pelihahmo p) {
		System.out.println("Charmander puolustautuu ja ansaitsee " + P + "xp");
		p.setXp(P);
	}

	@Override
	void liiku(Pelihahmo p) {
		System.out.println("Charmander liikkuu ja ansaitsee " + L + "xp");
		p.setXp(L);
	}
}
