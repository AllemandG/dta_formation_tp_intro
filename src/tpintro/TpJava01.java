package tpintro;

public class TpJava01 {
	public static void main(String args[]){
		int l = args.length;
		int i = 0;
		if(l != 0){
			while (i < l) {
				System.out.println("Bonjour " + args[i] + " !");
				i++;
			}
		}else{
			System.out.println("Bonjour !");
		}
	}
}