//Neev Bitton 318504164 Orel Dadon 313278061
package XO;

public class Cell {
	/**
	 * Properties
	 */
	private int row;
	private int col;

	/**
	 * Constructor
	 * 
	 * @param row
	 * @param col
	 */
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	/**
	 * Get row
	 * 
	 * @return row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * Get col
	 * 
	 * @return col
	 */
	public int getCol() {
		return col;
	}

}
