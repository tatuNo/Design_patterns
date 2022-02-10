package template;

/** Main */
final class TemplateMethodMain {
	/* default */
	private TemplateMethodMain () {};
	/**
	 * Comment
	 * @param args args
 	 */
	public static void main(final String[] args) {
		final AbstractGame gameOfMyLife = new GuessGame();
		gameOfMyLife.playOneGame(3);
	}
}
