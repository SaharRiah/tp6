package tp6;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ustensile[] us = new Ustensile[5];
		us[0] = new AssietteRonde(1926, 8.4);
		us[1] = new Cuillere(1881, 7.3);
		us[2] = new AssietteCarree(1935, 5.6);
		us[3] = new Cuillere(1917, 8.8);
		us[4] = new AssietteRonde(1837, 5.4);

		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
		}

		static void afficherCuilleres(Ustensile[] us) { 
			int nbCuilleres = 0;
			for (int i = 0; i < us.length; i++) {
				if(us[i] instanceof Cuillere) {
					nbCuilleres++;
				}
		}
		System.out.println("Il y a " + nbCuilleres + " cuillères.");
		}
		static void afficherSurfaceAssiettes(Ustensile[] us) { 
			double surface = 0;
			for (int i = 0; i < us.length; i++) {
				if(us[i] instanceof AssietteRonde) {
					surface=surface+((AssietteRonde)(us[i])).calculsurfaceAssietteRonde();
				}
				if(us[i] instanceof AssietteCarree) {
					surface=surface+((AssietteCarree)(us[i])).calculsurfaceAssietteCarree();
					
				}
		}
		System.out.println("surface Assiette: " + surface);
		}
		
		
		static void afficherValeurTotale(Ustensile[]us) { 
			int v = 0;
			for (int i = 0; i < us.length; i++) {
				if(us[i] instanceof Ustensile) {
					v=v+((Ustensile)us[i]).calculUstensile();
				}
		}
		System.out.println("ValeurTotale: " + v +"dt");
	}
}


