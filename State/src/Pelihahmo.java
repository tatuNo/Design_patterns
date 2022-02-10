
public class Pelihahmo {
	
	private Kehitysmuoto pokemon;
	private int xp;
	
	public Pelihahmo () {
		pokemon = Charmander.getInstance();
		xp = 0;
	}
	
	public void taistele () {
		pokemon.taistele(this);
		// visitor visit?
	}
	
	public void puolusta () {
		pokemon.puolusta(this);
		// visitor visit?
	}
	
	public void liiku () {
		pokemon.liiku(this);
		// visitor visit this?
	}
	
	public void setXp(int xp) {
		this.xp += xp;
	}
	
	public int getXp () {
		return xp;
	}
	
	protected void setPokemon (Kehitysmuoto k) {
		this.pokemon = k;
	}
}

/** VISITOR:  void tarkasta xp -> get xp if xp < 100 -> kehity if xp > 200 -> kehity jne... */
