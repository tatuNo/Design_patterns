
public class RollUpCommand implements Command {
	
	private SilverScreen screen;
	
	public RollUpCommand(SilverScreen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.rollUp();
	}
}
