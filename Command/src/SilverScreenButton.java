
public class SilverScreenButton {
	private Command cmd;
	
	public SilverScreenButton(Command cmd) {
		this.cmd = cmd;
	}
	
	public void press() {
		cmd.execute();
	}
}
