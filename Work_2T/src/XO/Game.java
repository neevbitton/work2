//Neev Bitton 318504164 Orel Dadon 313278061
package XO;

public abstract class Game {
	protected char[][] gameBoard;

	/**
	 * The Method print the board of the game
	 */
	public synchronized void printBoard() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				System.out.print("[" + gameBoard[i][j] + "]");
			}
			System.out.println();
		}
	}

	/**
	 * Abstract function
	 * 
	 */
	public abstract char getTurn();

	/**
	 * Get GameBoard
	 * 
	 * @return gameBoard
	 */
	public synchronized char[][] getGameBoard() {
		return gameBoard;
	}

	/**
	 * The function checks who are the empty cells
	 * 
	 * @return new array of the empty cells
	 */
	public synchronized Cell[] getFreeCells() {
		int counter = 0;
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				if (gameBoard[i][j] == '-')
					counter++;
			}
		}
		Cell[] temp = new Cell[counter];
		int index = 0;
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				if (gameBoard[i][j] == '-') {
					temp[index] = new Cell(i, j);
					index++;
				}
			}
		}
		return temp;

	}

	/**
	 * The function checks if the board is full
	 * 
	 * @return
	 */
	public boolean isFull() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				if (gameBoard[i][j] == '-')
					return false;
			}

		}
		System.out.println("Board is full.");
		return true;
	}

	/**
	 * The function initialize the board with char '-'
	 */
	public void initializeBoard() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = '-';
			}

		}
	}

	/**
	 * The function checks if someone won the game
	 * 
	 * @return true or false
	 */
	public boolean checkWin() {
		// check rows
		for (int i = 0; i < gameBoard.length; i++) {
			if (gameBoard[i][0] == 'X' && gameBoard[i][1] == 'X' && gameBoard[i][2] == 'X' && gameBoard[i][3] == 'X'
					|| gameBoard[i][4] == 'X' && gameBoard[i][1] == 'X' && gameBoard[i][2] == 'X'
							&& gameBoard[i][3] == 'X'
					|| gameBoard[i][0] == 'O' && gameBoard[i][1] == 'O' && gameBoard[i][2] == 'O'
							&& gameBoard[i][3] == 'O'
					|| gameBoard[i][4] == 'O' && gameBoard[i][1] == 'O' && gameBoard[i][2] == 'O'
							&& gameBoard[i][3] == 'O')
				return true;
		}
		// check cols
		for (int j = 0; j < gameBoard.length; j++) {
			if (gameBoard[0][j] == 'X' && gameBoard[1][j] == 'X' && gameBoard[2][j] == 'X' && gameBoard[3][j] == 'X'
					|| gameBoard[4][j] == 'X' && gameBoard[1][j] == 'X' && gameBoard[2][j] == 'X'
							&& gameBoard[3][j] == 'X'
					|| gameBoard[0][j] == 'O' && gameBoard[1][j] == 'O' && gameBoard[2][j] == 'O'
							&& gameBoard[3][j] == 'O'
					|| gameBoard[4][j] == 'O' && gameBoard[1][j] == 'O' && gameBoard[2][j] == 'O'
							&& gameBoard[3][j] == 'O')
				return true;
		}
		if (gameBoard[0][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X' && gameBoard[3][3] == 'X'
				|| gameBoard[4][4] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X' && gameBoard[3][3] == 'X'
				|| gameBoard[0][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O' && gameBoard[3][3] == 'O'
				|| gameBoard[4][4] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O' && gameBoard[3][3] == 'O')
			return true;
		if (gameBoard[0][4] == 'X' && gameBoard[1][3] == 'X' && gameBoard[2][2] == 'X' && gameBoard[3][1] == 'X'
				|| gameBoard[0][4] == 'O' && gameBoard[1][3] == 'O' && gameBoard[2][2] == 'O' && gameBoard[3][1] == 'O'
				|| gameBoard[4][0] == 'X' && gameBoard[3][1] == 'X' && gameBoard[2][2] == 'X' && gameBoard[1][3] == 'X'
				|| gameBoard[4][0] == 'O' && gameBoard[3][1] == 'O' && gameBoard[2][2] == 'O' && gameBoard[1][3] == 'O')
			return true;
		if (gameBoard[0][1] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][3] == 'X' && gameBoard[3][4] == 'X'
				|| gameBoard[0][1] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][3] == 'O' && gameBoard[3][4] == 'O'
				|| gameBoard[1][0] == 'X' && gameBoard[2][1] == 'X' && gameBoard[3][2] == 'X' && gameBoard[4][3] == 'X'
				|| gameBoard[1][0] == 'O' && gameBoard[2][1] == 'O' && gameBoard[3][2] == 'O' && gameBoard[4][3] == 'O')
			return true;
		if (gameBoard[0][3] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][1] == 'X' && gameBoard[3][0] == 'X'
				|| gameBoard[0][3] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][1] == 'O' && gameBoard[3][0] == 'O'
				|| gameBoard[1][4] == 'X' && gameBoard[2][3] == 'X' && gameBoard[3][2] == 'X' && gameBoard[4][1] == 'X'
				|| gameBoard[1][4] == 'O' && gameBoard[2][3] == 'O' && gameBoard[3][2] == 'O' && gameBoard[4][1] == 'O')
			return true;
		return false;
	}
}
