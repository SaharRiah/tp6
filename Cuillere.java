package tp6;

public class Cuillere extends Ustensile{
	private double longueur;

	public Cuillere(int annee,double longueur) {
		super(annee);
		this.longueur=longueur;
		// TODO Auto-generated constructor stub
	}
	public int calculUstensile()
	{
		if((2024-this.annee)<50) {
			return 0;
		}
		else
			return (2024-this.annee-50);
	}
	
	

}
