package main_package;

public class Toimitusjohtaja extends Pomo {
	
	private static final double RAJA = 1.10;
	
	@Override
	public void kasittelePalkkapyynto(Tyontekija t, int uusiPalkka) {
		if(uusiPalkka / (double) t.getPalkka() > RAJA) {
			System.out.println("Toimitusjohtaja nauraa palkkapyynnöllesi");
		} else {
			System.out.println("Toimitusjohtaja hyväksyy pyynnön");
			t.setPalkka(uusiPalkka);
		}
	}

}
