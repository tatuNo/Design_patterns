
public class XPtarkastaja implements PelihahmoVisitor {

	@Override
	public void tarkastaXp(Pelihahmo p) {
		if(p.getXp() > 100 && p.getXp() < 200) {
			
			if(p.getPokemon() != Charmeleon.getInstance()) {
				System.out.println("Charmander kehittyy charmeleoniksi");
				p.setPokemon(Charmeleon.getInstance());
			}
			
		} else if(p.getXp() > 200 && p.getXp() < 300) {
			
			if(p.getPokemon() != Charizard.getInstance()) {
				System.out.println("Charmeleon kehittyy charizardiksi");
				p.setPokemon(Charizard.getInstance());
			}
			
		}
	}
}
