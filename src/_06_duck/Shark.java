package _06_duck;

public class Shark {
	public int numberOfTeeth;
	public String sizeOfShark;
	
	Shark(int numberOfTeeth, String sizeOfShark){
		this.numberOfTeeth=numberOfTeeth;
		this.sizeOfShark=sizeOfShark;
	}


public void chomp() {
	System.out.println("CHOMP!");
	System.out.println(numberOfTeeth);
	System.out.println(sizeOfShark);
	
	}
}
