package template;
/** Games absract class */
abstract class AbstractGame {
	 /** Player count */
     protected int playersCount;
     /** default */
     public abstract void initializeGame(int playersCount);
     /** default */
     public abstract void makePlay(int player);
     /** default */
     public abstract boolean endOfGame();
     /** default */
     public abstract void printWinner();
     /**
      * Empty constructor
      */
     public AbstractGame () {
    	 // This is intentionally empty.
     };
     
     public int getPlayersCount() {
		return playersCount;
	}

	public void setPlayersCount(final int playersCount) {
		this.playersCount = playersCount;
	}

	/**
	 * nice
	 * @param playersCount the nice
	 */
     public final void playOneGame(final int playersCount) {
         this.playersCount = playersCount;
         initializeGame(playersCount);
         int jeppista = 1;
         while (!endOfGame()){
             makePlay(jeppista);
             jeppista++;
         }
         printWinner();
     }
 }

