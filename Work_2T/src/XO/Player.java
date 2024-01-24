//Neev Bitton 318504164 Orel Dadon 313278061
package XO;

public abstract class Player {
	/**
	 * Properties
	 */
	private char sign;
	private Game game;

	/**
	 * Constructor
	 * 
	 * @param sign
	 * @param game
	 */
	public Player(char sign, Game game) {
		this.sign = sign;
		this.game = game;
	}

	/**
	 * Get sign
	 * 
	 * @return sign
	 */
	public char getSign() {
		return this.sign;
	}

	/**
	 * Get game
	 * 
	 * @return game
	 */
	public synchronized Game getGame() {
		return game;
	}

}
