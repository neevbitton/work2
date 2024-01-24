//Neev Bitton 318504164 Orel Dadon 313278061
package Race;

public class Track {
	/**
	 * Properties
	 */
	private int finishedRacers;

	/**
	 * Constructor
	 */
	public Track() {
		this.finishedRacers = 1;
	}

	/**
	 * Get finished racers
	 * 
	 * @return
	 */
	public synchronized int getFinishedRacers() {
		return finishedRacers;
	}

	/**
	 * set finished racers
	 * 
	 * @param finishedRacers
	 */
	public synchronized void setFinishedRacers(int finishedRacers) {
		this.finishedRacers = finishedRacers;
	}
}
