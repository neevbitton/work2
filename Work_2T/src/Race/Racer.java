//Neev Bitton 318504164 Orel Dadon 313278061
package Race;

public class Racer implements Runnable {
	/**
	 * Properties
	 */
	private static int globalId = 1;
	private int id;
	private int speed;
	private Track track;

	/**
	 * Constructor
	 * @param speed
	 * @param track
	 */
	public Racer(int speed, Track track) {
		id = globalId;
		try {
			if (speed < 1 || speed > 10)
				throw new Exception();
		} catch (Exception e) {
			System.out.println("Speed is not between 1-10");
		}
		this.speed = speed;
		this.track = track;
		globalId++;
	}

	/**
	 * Function go 
	 */
	public void  go() {
		Thread.currentThread().setPriority(speed);
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.currentThread().sleep(100/speed);
			}catch(Exception e){}
			System.out.println("Runner " + id + " ran " + i + " meters");
				if (i == 100) {
					System.out.println("Runner " + id + " finished " + track.getFinishedRacers() + place());
					track.setFinishedRacers(track.getFinishedRacers() + 1);	
				}
				
		}
	}

	/**
	 * Function run
	 */
	public void run() {
		go();
	}
	private String place() {
		if (track.getFinishedRacers() == 1)
			return "st";
		if (track.getFinishedRacers() == 2)
			return "nd";
		if (track.getFinishedRacers()== 3)
			return "rd";
		return "th";
		
	}
}
