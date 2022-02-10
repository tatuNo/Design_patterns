import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		Class c = null;
		VaateFactory tehdas = null;
		Jasper jasper = new Jasper();
		
		Properties properties = new Properties();
		try {
			properties.load(
			new FileInputStream("tehdas.properties"));
			} catch (IOException e) {e.printStackTrace();}
			try{
			c = Class.forName(properties.getProperty("tehdas"));
			tehdas = (VaateFactory)c.getDeclaredConstructor().newInstance();
			}catch (Exception e){e.printStackTrace();}
			
		jasper.setFarkut(tehdas.luoFarkut());
		jasper.setKengat(tehdas.luoKengat());
		jasper.setLippis(tehdas.luoLippis());
		jasper.setPaita(tehdas.luoPaita());
		System.out.println(jasper);
	}
}
