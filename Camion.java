package TP;

public class Camion extends Vehicule{
  private int ChargesMaximales;
  public Camion(String numeroMatricule, String type, String marque, String couleur, int anneeFabrication,
			Double poids, Double vitesse , int ChargesMaximales) {
    super(numerpMatricule,type,marque,couleur,anneeFabrication,poids,vitesse);
    this.ChargesMaximales = ChargesMaximales;      
  }
  @override
  public String toString() {
		return super.toString()+ "charges maximales :" + chargesMaximales;
	}
	
  
}
