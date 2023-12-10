package TP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//La classe contenant un tableau de Vehicule
public class Parking {
	
	// attribut tableau de notre classe parking
	private Vehicule[] tabVehicule;

	// constructeur de la classe Parking
	public Parking(Vehicule[] tabVehicule) {
		this.tabVehicule = tabVehicule;
	}
	//Trier le tableau de vehicule
	public void sortParking() {
		// Arrays est la classe mere des tableau
		Arrays.sort(tabVehicule);
	}
	//Ajouter un element au tableau
	public void addElement(Vehicule v) {
		ArrayList <Vehicule> tempTableau = new ArrayList <Vehicule>(Arrays.asList(tabVehicule));
		tempTableau.add(v);
		tabVehicule = tempTableau.toArray(new Vehicule[tempTableau.size()]);
	}
	//La methode verifie l'existance d'un vehicule
	public boolean existe(Vehicule v1) {
		for ( Vehicule v : tabVehicule ) {
			if (v.equals(v1)) return true;
		}
		return false;
	}
	//Supprime un element du tableau 
	public boolean supprimerElement(Vehicule v) {
		ArrayList <Vehicule> tempTableau = new ArrayList<Vehicule>(Arrays.asList(tabVehicule));
		if(!this.existe(v)) return false;
		tempTableau.remove(v);
		tabVehicule = tempTableau.toArray(new Vehicule[tempTableau.size()]);
		return true;
	}
	//La methode compte le nombre d'element du tableau
	public int nombreElement() {
		return tabVehicule.length;
	}
	//Inverse l'ordre du tableau
	public void inverserOrdre() {
		List<Vehicule> list = new ArrayList<Vehicule>(Arrays.asList(tabVehicule));
		Collections.reverse(list);
		tabVehicule = list.toArray(new Vehicule[0]);
	}
	//Affiche les element du tableau 
	public void afficher() {		for (Vehicule vehicule : tabVehicule) {
			System.out.println(vehicule+"\n");}
	} 
	//La fonction retourneee max du tableau
	public Vehicule elementMax() {
		Vehicule temp = tabVehicule[0];
		for (Vehicule vehicule : tabVehicule) {
			if(vehicule.getAnneeFabrication() > temp.getAnneeFabrication()) {
				temp = vehicule;
			}
			
		}
		return temp;
	}
	//Teste l'egalite de deux tableau
	public boolean egaliteTab(Vehicule[] tab2) {
		
		return Arrays.equals(tabVehicule, tab2);
	}
}






