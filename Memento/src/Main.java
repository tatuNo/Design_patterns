
public class Main {

	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Arvaaja yksi = new Arvaaja("Pelaaja 1", arvuuttaja);
		Arvaaja kaksi = new Arvaaja("Pelaaja 2", arvuuttaja);
		Arvaaja kolme = new Arvaaja("Pelaaja 3", arvuuttaja);
		Arvaaja neli = new Arvaaja("Pelaaja 4", arvuuttaja);
		
		yksi.pelaa();
		kaksi.pelaa();
		kolme.pelaa();
		neli.pelaa();
		
		
		yksi.start();
		kaksi.start();
		kolme.start();
		neli.start();
	}	
}
