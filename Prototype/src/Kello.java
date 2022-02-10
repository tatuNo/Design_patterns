
public class Kello implements Cloneable {
    private Viisari tunnit;
    private Viisari minuutit;
    private Viisari sekunnit;

    public Kello() {
        this.tunnit = new Viisari(24);
        this.minuutit = new Viisari(60);
        this.sekunnit = new Viisari(60);
    }

    public void kay() {
        sekunnit.kay();

        if (sekunnit.getArvo() == 0) {
            minuutit.kay();

            if (minuutit.getArvo() == 0) {
                tunnit.kay();
            }
        }
    }
    
    
    public Kello clone() {
    	Kello k = null;
    	try {
    		k = (Kello)super.clone();
    		k.sekunnit = (Viisari)sekunnit.clone();
    		k.minuutit = (Viisari)minuutit.clone();
    		k.tunnit = (Viisari)tunnit.clone();
    	} catch(CloneNotSupportedException e) {
    		e.printStackTrace();
    	}
    	return k;
    }

    public String toString() {
        return tunnit + ":" + minuutit + ":" + sekunnit;
    }
}
