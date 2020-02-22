package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Runner {
public static void main(String[] args) {
	String popcornFlavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	Popcorn pop = new Popcorn(popcornFlavor);
	
	Microwave micro = new Microwave();
	micro.putInMicrowave(pop);
	micro.setTime(5);
	micro.startMicrowave();
	
	

}
}
