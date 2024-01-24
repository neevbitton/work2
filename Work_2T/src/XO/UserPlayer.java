//Neev Bitton 318504164 Orel Dadon 313278061
package XO;

import java.util.Random;
import java.util.Scanner;

public class UserPlayer extends Player implements Runnable {
	Scanner input;

	/**
	 * Constructor
	 * 
	 * @param sign
	 * @param game
	 */
	public UserPlayer(char sign, UserGame game) {
		super(sign, game);
		input = new Scanner(System.in);

	}

	/**
	 * Run function
	 */
	public synchronized void run() {
		System.out.println("Your sign is 'X', lets start!");
		while (!super.getGame().isFull()) {
			super.getGame().printBoard();
			System.out.println("Enter row(0-4) and col(0-4)");
			int row = input.nextInt();
			int col = input.nextInt();
			while (getGame().getGameBoard()[row][col] != '-') {
				System.out.println("Invalid input. Try again.");
				row = input.nextInt();
				col = input.nextInt();
			}
			getGame().getGameBoard()[row][col] = 'X';
			if (getGame().checkWin()) {
				System.out.println("You won!");
				return;
			}
			pick();
			if (getGame().checkWin()) {
				System.out.println("Thread won!");
			}
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
		this.getGame().getGameBoard()[temp[choice].getRow()][temp[choice].getCol()] = 'O';
	}
}
