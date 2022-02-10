import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Kello kello = new Kello();
		Kello clooni = kello.clone();
		Scanner scanner = new Scanner(System.in);
		int valinta;
		do {
			String s = "";
			System.out.println("\n\t\t\t1. Käynnistä alkuperäinen kello.");
			System.out.println("\t\t\t2. Käynnistä kellon klooni.");
			System.out.println("\t\t\t3. lopetus ");
			System.out.print("\n\n");
			valinta = scanner.nextInt();
			switch (valinta) {
			case 1:
				System.out.println("Kello etenee tyhjällä syötteellä, pysähtyy kun syötät merkkijonon");
				while(s.length() == 0) {
					s = scanner.nextLine();
					System.out.println(kello);
					kello.kay();
				}
				break;
			case 2:
				System.out.println("Kellon klooni etenee tyhjällä syötteellä, pysähtyy kun syötät merkkijonon");
				while(s.length() == 0) {
					s = scanner.nextLine();
					System.out.println(clooni);
					clooni.kay();
				}
				break;
			}
		} while(valinta != 3);
	}
}