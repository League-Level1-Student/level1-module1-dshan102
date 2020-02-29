package _05_vault;

public class Vault {
	private static int key = 5;
public static void main(String[] args) {
	tryCode(5);
}
public static void tryCode(int n) {
	if(n==key) {
		System.out.println("Correct");

	}
	else {
		System.out.println("Incorrect");
	}
}
}

