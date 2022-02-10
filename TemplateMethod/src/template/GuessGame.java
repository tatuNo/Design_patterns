package template;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
/** Game */
public class GuessGame extends AbstractGame {
	/** rdm */
	private transient final Random rdm = new Random();
	/** number to guess */
	private transient int numberToGuess;
	/** guess count */
	private transient Map<Integer,Integer> guesses;
	/** scanner */
	private transient final Scanner scanner = new Scanner(System.in);
	/** game player count */
	private int playersCount;
	
	/* default */
	@Override
	public int getPlayersCount() {
		return playersCount;
	}
	/* default */
	@Override
	public void setPlayersCount(final int playersCount) {
		this.playersCount = playersCount;
	}

	/* default */
	@Override
	public void initializeGame(final int playersCount) {
		this.playersCount = playersCount;
		guesses = new HashMap<>();
		numberToGuess = rdm.nextInt(100);
	}

	/* default */
	@Override
	public void makePlay(final int player) {
		System.out.println("Pelaaja " + player + ", arvaa numero väliltä 0-100");
		int guess = scanner.nextInt();
		while(guess < 0 || guess > 100) {
			System.out.println("Numeron pitää olla väliltä 0-100");
			guess = scanner.nextInt();
		}
		guesses.put(player, guess);
	}

	/* default */
	@Override
	public boolean endOfGame() {
		return guesses.size() == playersCount;
	}

	/* default */
	@Override
	public void printWinner() {
		int closest = 100;
		String winner = "";
		boolean draw = false;
		int value = closest;
		
		for(Map.Entry<Integer, Integer> entry : guesses.entrySet()) {
			
			if(Math.abs(numberToGuess - entry.getValue()) < closest) {
				closest = Math.abs(numberToGuess - entry.getValue());
				winner = Integer.toString(entry.getKey());
				value = entry.getValue();
				
			} else if(Math.abs(numberToGuess - entry.getValue()) == closest) {
				draw = true;
				winner += ", " + entry.getKey();
			}	
		}
		if(draw) {
			System.out.println("Tasapeli pelaajat " + winner + ". Arvattava luku oli: " + numberToGuess);
		} else {
			System.out.println("Lähimmäksi arvannut pelaaja " + winner + " luvulla " + value + ". Arvattava luku oli: " + numberToGuess);
		}
	}
}

