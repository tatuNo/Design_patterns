
public class RollDownCommand implements Command {
	
	private SilverScreen screen;
	
	public RollDownCommand(SilverScreen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.rollDown();
	}
}