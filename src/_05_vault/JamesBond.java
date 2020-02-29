package _05_vault;

public class JamesBond {
	public void findCode(Vault v){
		for(int i=0; i<1000000; i++) {
		v.tryCode(i);
		}
	}
}
	


