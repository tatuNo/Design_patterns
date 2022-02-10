
public class Pelihahmo {
	
	private Kehitysmuoto pokemon;
	private int xp;
	private PelihahmoVisitor visitor;
	
	public Pelihahmo (PelihahmoVisitor v) {
		this.pokemon = Charmander.getInstance();
		this.xp = 0;
		this.visitor = v;
	}
	
	public void taistele () {
		pokemon.taistele(this);
		visitor.tarkastaXp(this);
	}
	
	public void puolusta () {
		pokemon.puolusta(this);
		visitor.tarkastaXp(this);
	}
	
	public void liiku () {
		pokemon.liiku(this);
		visitor.tarkastaXp(this);
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
	
	public Kehitysmuoto getPokemon () {
		return pokemon;
	}
}

