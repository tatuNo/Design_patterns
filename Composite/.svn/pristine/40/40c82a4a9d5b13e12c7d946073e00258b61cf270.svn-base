
public class Main {

	public static void main(String[] args) {
		Laiteosa kotelo = new Kotelo();
		kotelo.lisaaOsa(new Levykeasema());
		kotelo.lisaaOsa(new Virtalahde());
		Laiteosa emolevy = new Emolevy();
		kotelo.lisaaOsa(emolevy);
		
		emolevy.lisaaOsa(new Prosessori());
		emolevy.lisaaOsa(new Verkkokortti());
		emolevy.lisaaOsa(new Naytonohjain());
		emolevy.lisaaOsa(new Muistipiiri());
		
		System.out.println(kotelo.getHinta());
		// pitäisi olla 164
	}

}
