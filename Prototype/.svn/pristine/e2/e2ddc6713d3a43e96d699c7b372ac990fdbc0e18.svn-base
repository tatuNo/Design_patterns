
public class Viisari implements Cloneable {
    private int arvo;
    private final int raja;

    public Viisari(int raja) {
        this.raja = raja;
        this.arvo = 0;
    }

    public int getArvo() {
        return arvo;
    }
    
    public void kay() {
        arvo += 1;

        if (arvo >= raja) {
            this.arvo = 0;
        }
    }
    
    public Object clone() {
    	try {
    		return super.clone();
    	} catch(CloneNotSupportedException e) {
    		e.printStackTrace();
    	}
    	return null;
    }

    public String toString() {
        if (arvo < 10) {
            return "0" + arvo;
        }

        return "" + arvo;
    }
}