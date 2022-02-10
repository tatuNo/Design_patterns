import java.util.Scanner;

public class Arvaaja extends Thread {
	
	private Object obj;
	private String nimi;
	private Scanner scanner = new Scanner(System.in);
	private Arvuuttaja arvuuttaja;
	
	public Arvaaja (String nimi, Arvuuttaja a) {
		this.nimi = nimi;
		this.arvuuttaja = a;
	}
	
	public void run() {
		boolean arvausOikein = false;
		
		while(!arvausOikein) {
			System.out.println();
			synchronized(arvuuttaja) {	
			int luku = annaLuku();
			arvausOikein = arvaus(luku);
			if(!arvausOikein) {
				System.out.println("Väärin!");
			}
		}
	}
		System.out.println("Oikein!");
	}
	
	public void pelaa() {
		this.obj = arvuuttaja.liityPeliin();
	}
	
	private boolean arvaus(int luku) {
		return arvuuttaja.kasitteleArvaus(obj, luku);
	}
	
	private int annaLuku () {
		System.out.println(nimi + " arvaa luku väliltä 0-10");
		return scanner.nextInt();
	}
}
