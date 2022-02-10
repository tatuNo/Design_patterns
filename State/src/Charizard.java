
public class Charizard extends Kehitysmuoto {
	
	private static Charizard INSTANCE = null;
	private final int T = 16;
	private final int P = 13;
	private final int L = 10;
	
	private Charizard () {}
	
	public static Kehitysmuoto getInstance () {
		if(INSTANCE == null) {
			INSTANCE = new Charizard();
		}
		return INSTANCE;
	}

	@Override
	void kehity(Pelihahmo p) {
		System.out.println("Charizard ei voi kehittyä, xp:tä ansaittu: " + p.getXp());
	}

	@Override
	void taistele(Pelihahmo p) {
		System.out.println("Charizard taistelee ja ansaitsee " + T + "xp");
		p.setXp(T);
		tarkastaXp(p);
	}

	@Override
	void puolusta(Pelihahmo p) {
		System.out.println("Charizard puolustautuu ja ansaitsee " + P + "xp");
		p.setXp(P);
		tarkastaXp(p);
	}

	@Override
	void liiku(Pelihahmo p) {
		System.out.println("Charizard liikkuu ja ansaitsee " + L + "xp");
		p.setXp(L);
		tarkastaXp(p);
	}

	@Override
	void tarkastaXp(Pelihahmo p) {
		if(p.getXp() > 300)
			kehity(p);
	}

}
