//Neev Bitton 318504164 Orel Dadon 313278061
package XO;

public class UserGame extends Game {
	/**
	 * Get Turn
	 */
	public char getTurn() {
		return 'O';
	}

	/**
	 * Constructor
	 */
	public UserGame() {
		this.gameBoard = new char[5][5];
		initializeBoard();
	}

}
