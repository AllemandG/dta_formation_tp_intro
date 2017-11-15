package tpintro;

public class TpJava04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = args.length;
		int i = 0;
		if(l != 0){
			while (i < l) {
				float montant = Float.parseFloat(args[i]);
				float remise = 0f;
		
				if (montant >= 1000 && montant < 2000) {
					remise = 0.01f * montant;
				} else if (montant >= 2000 && montant < 5000) {
					remise = 0.03f * montant;
				} else if (montant >= 5000) {
					remise = 0.05f * montant;
				}
		
				System.out.println(montant + " => " + remise);
				i++;
			}
		}
	}
}
