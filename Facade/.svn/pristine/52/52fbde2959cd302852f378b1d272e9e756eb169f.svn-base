import java.util.Random;

public class HardDrive {
	
	private Random rdm = new Random();
	private final String alphabet = "456789ABCDEFGHIJKLMN";
	
	public char[] read (long lba, int size) {
		char [] data = new char[size];
		System.out.println("Hard drive reading at " + lba + " size of " + size);
		for(int i = 0; i < size; i++) {
			data[i] = alphabet.charAt(rdm.nextInt(alphabet.length()));
		}
		return data;
	}
}
