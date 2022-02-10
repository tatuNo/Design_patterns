import java.util.Random;

public class Arvuuttaja {
	private Random rdm;
	
	public Arvuuttaja () {
		rdm = new Random();
	}
	
	public Memento liityPeliin () {
		int luku = rdm.nextInt(10);
		return new Memento(luku);
	}
	
	public boolean kasitteleArvaus(Object obj, int luku) {
		Memento memento = (Memento) obj;
		if(memento.getLuku() == luku)
			return true;
		else
			return false;
	}
	
	private class Memento{
		private int luku;

		public Memento(int luku){
			this.luku = luku;
		}
		
		public int getLuku() {
			return this.luku;
		}
	}
}
