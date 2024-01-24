//Neev Bitton 318504164 Orel Dadon 313278061
package XO;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Choose your game : \n 1.Self game \n 2.User game");
		int choice=input.nextInt();
		switch(choice) {
		case 1:
			SelfGame s1=new SelfGame();
			SelfPlayer p1=new SelfPlayer('X',s1);
			SelfPlayer p2=new SelfPlayer('O',s1);
			Thread t1=new Thread(p1);
			Thread t2=new Thread(p2);
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			}catch(Exception e) {}
			break;
		case 2:
			UserGame ug = new UserGame();
			UserPlayer up = new UserPlayer('X',ug);
			Thread t3 = new Thread(up);
			t3.start();
			break;
			
			
			
		}
	}

}
