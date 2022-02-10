package main_package;

abstract class Pomo {
	
	private Pomo paallikko;
	
	public void setPomo(Pomo p) {
		this.paallikko = p;
	}
	
	public void kasittelePalkkapyynto(Tyontekija t, int uusiPalkka) {
		if(paallikko != null)
			paallikko.kasittelePalkkapyynto(t, uusiPalkka);
	}
}
