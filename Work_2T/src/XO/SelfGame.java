//Neev Bitton 318504164 Orel Dadon 313278061
package XO;

import java.util.Random;

public class SelfGame extends Game {
	/**
	 * Properties
	 */
	private SelfPlayer p1;
	private SelfPlayer p2;
	private char currentPlayer = 'X';

	/**
	 * Constructor
	 */
	public SelfGame() {
		this.gameBoard = new char[5][5];
		initializeBoard();
	}

	/**
	 * set Current Player
	 * 
	 * @param c
	 */
	public synchronized void setCurrentPlayer(char c) {
		currentPlayer = c;
	}

	/**
	 * The function returns the sign of player whose turn is to play
	 */
	public synchronized char getTurn() {
		return currentPlayer;
	}

}
