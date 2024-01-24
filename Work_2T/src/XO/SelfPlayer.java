//Neev Bitton 318504164 Orel Dadon 313278061
package XO;

import java.util.Random;

public class SelfPlayer extends Player implements Runnable {
	/**
	 * Properties
	 */
	private char currentPlayer = 'X';

	/**
	 * Constructor
	 * 
	 * @param sign
	 * @param game
	 */
	public SelfPlayer(char sign, SelfGame game) {
		super(sign, game);

	}

	/**
	 * The function run in a loop and then will check if it's the player turn If
	 * indeed his turn has come, and the board is not full He will randomly select a
	 * cell on the board from among all the free cells, and mark it with a X or an O
	 * according to the type which represents
	 */
	public synchronized void run() {
		while (!super.getGame().isFull()) {
			try {
				Thread.currentThread().sleep(500);
			} catch (Exception e) {
			}
			if (this.getGame().checkWin())
				return;
			pick();
			this.getGame().printBoard();
			System.out.println();

			if (this.getGame().checkWin()) {
				System.out.println("The winner is player " + this.getSign());
				return;
			}
			if (getGame().getTurn() == 'X')
				((SelfGame) this.getGame()).setCurrentPlayer('O');
			else
				((SelfGame) this.getGame()).setCurrentPlayer('X');

		}

	}

	/**
	 * The function pick a random cell and insert the sign of the player that it his
	 * turn
	 */
	public synchronized void pick() {
		Random ran = new Random();
		Cell[] temp = this.getGame().getFreeCells();
		int choice = ran.nextInt(temp.length);
		this.getGame().getGameBoard()[temp[choice].getRow()][temp[choice].getCol()] = this.getSign();
	}
}
