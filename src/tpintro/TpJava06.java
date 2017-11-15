package tpintro;

public class TpJava06 {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		
		long fact = factorielleFor (x);
		
		System.out.println(fact);
	}
	
	private static long factorielleFor (long n) {
		long factorielle = 1L;
		
		for (int i = 1; i <= n; i++) {
			factorielle *= i;
		}
		
		return factorielle;
	}

}
