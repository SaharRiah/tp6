package tp6;

public class AssietteRonde extends Assiette {
	private double rayon;

	public AssietteRonde(int annee,double rayon) {
		super(annee);
		this.rayon=rayon;
		// TODO Auto-generated constructor stub
	}
	public  double calculsurfaceAssietteRonde() {
		double s= 3.14*this.rayon*this.rayon;
		return s;
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
