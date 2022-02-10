package main_package;

public class Paallikko extends Pomo {
	
	private static final double RAJA = 1.05;
	
	@Override
	public void kasittelePalkkapyynto(Tyontekija t, int uusiPalkka) {
		if(uusiPalkka / (double) t.getPalkka() > RAJA) {
			System.out.println("Päällikkö siirtää pyynnön eteenpäin");
			super.kasittelePalkkapyynto(t, uusiPalkka);
		} else { 
			System.out.println("Päällikkö hyväksyy pyynnön");
			t.setPalkka(uusiPalkka);
		}
	}
}
