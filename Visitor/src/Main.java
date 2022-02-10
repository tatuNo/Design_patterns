import java.util.Random;

public class Main {

	public static void main(String[] args) {
		PelihahmoVisitor tarkastaja = new XPtarkastaja();
		Pelihahmo p = new Pelihahmo(tarkastaja);
		Random random = new Random();
		
		while(p.getXp() < 400) {
			int luku = random.nextInt(3);
			if(luku == 0) {
				p.liiku();
			} else if (luku == 1) {
				p.puolusta();
			} else {
				p.taistele();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
