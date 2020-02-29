package _06_duck;

public class Duck {
	public int numberOfFriends;
	public String favoriteFood;
	
	//Constructor
	Duck(String favoriteFood,int numberOfFriends){
		this.favoriteFood=favoriteFood;
		this.numberOfFriends=numberOfFriends;
		
	}
	
	//Method
	public void quack(){
		System.out.println("Quack!");
		System.out.println(numberOfFriends);
		System.out.println(favoriteFood);
	}
}


