package tpintro;

public class TpJava04Partie2 {
	public static void main(String[] args) {
		int l = args.length;
		int i = 0;

		while (i < l) {
			System.out.println(calculRemise(Float.parseFloat(args[i])));
			i++;
			System.out.println(typeSac(Integer.parseInt(args[i])));
			i++;
		}

	}

	private static String calculRemise(float montant) {
		float remise = 0f;

		if (montant >= 1000 && montant < 2000) {
			remise = 0.01f * montant;
		} else if (montant >= 2000 && montant < 5000) {
			remise = 0.03f * montant;
		} else if (montant >= 5000) {
			remise = 0.05f * montant;
		}

		return (montant + " => " + remise);
	}

	private static String typeSac(int poids) {
		String type = "";

		switch (poids) {
		case 0 : 
			type = "pas de sac, merci pour votre générosité =)";
			break;
		case 1:
			type = "petit";
			break;
		case 2:
			type = "moyen";
			break;
		default:
			type = "grand";
		}

		return type;
	}
}
