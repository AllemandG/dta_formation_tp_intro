package tpintro;

public class TpJava07 {

	public static void main(String[] args) {
		int nombrePremiersAfficher = Integer.parseInt(args[0]);
		
		int k = 0;
		
		int nombreActuel = 2;
		
		while (k < nombrePremiersAfficher) {
			if (estPremier(nombreActuel)) {
				System.out.println(nombreActuel);
				k++;
			}
			nombreActuel++;
		}

	}
	
	private static boolean estPremier(int nombre) {
		boolean premier = true;
		for (int i = 2; i < nombre; i++) {
			if ((nombre % i) == 0) {
				premier = false;
				break;
			}
		}
		return premier;
	}

}
