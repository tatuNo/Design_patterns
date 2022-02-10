
public class Memory {

	public void load(long position, char[] data) {
		for(char c : data) {
			System.out.println("Memory loading at " + position + " data: " + c);
		}
	}
}
