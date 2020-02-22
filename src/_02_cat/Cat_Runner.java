package _02_cat;

public class Cat_Runner {
public static void main(String[] args) {
	Cat cat = new Cat("Gary");
	cat.meow();
	cat.printName();
	for(int i=0; i<9; i++) {
		cat.kill();
	}
}
}
