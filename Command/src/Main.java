
public class Main {

	public static void main(String[] args) {
		SilverScreen screen = new SilverScreen();
		Command up = new RollUpCommand(screen);
		Command down = new RollDownCommand(screen);
		
		SilverScreenButton buttonUp = new SilverScreenButton(up);
		SilverScreenButton buttonDown = new SilverScreenButton(down);
		
		buttonUp.press();
		buttonDown.press();
	}
}
