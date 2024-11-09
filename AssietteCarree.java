package tp6;

public class AssietteCarree extends Assiette{
	private double cote;

	public AssietteCarree(int annee, double cote) {
		super(annee);
		this.cote = cote;
	}
	public double calculsurfaceAssietteCarree() {
		double s= cote*cote;
		return s;
	}
	public int calculUstensile()
	{
		return (2024-this.annee)*50;
	}

}
