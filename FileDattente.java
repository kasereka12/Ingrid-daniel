package TP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FileDattente implements Comparator<Vehicule>{
    private List<Vehicule> list =new ArrayList<Vehicule>();;
    
    //ALimenter la liste
	public void alimenterList() {
		list.add(new Vehicule("AB045_G1_MA","VOITURE","DACIA","ROUGE",2000,1045.00,245.00));
		list.add(new Vehicule("AK015_G2_MA","CAMION","MERCEDES","BLANC",1988,9045.00,120.00));
		list.add(new Vehicule("GR195_G3_MA","MOTO","YAMAHA","NOIR",2011,445.00,270.00));
		list.add(new Vehicule("GC045_G4_MA","VOITURE","TOYOTA","BLEU",2001,2200.00,225.00));
		list.add(new Vehicule("AK047_G5_MA","VOITURE","RENAULT","BLEU",2000,1045.00,245.00));
		list.add(new Vehicule("BW12T_G6_MA","CAMION","MERCEDES","NOIR",1989,10024.00,190.00));
	}
	//Afficher liste
	public void afficherList() {
		for(Vehicule v:list) {
			System.out.println(v+"\n");
		}
	}
	//Parcourt la liste et renvoi un boolean 
    public boolean parcourir() {
    	Iterator<Vehicule> it = list.iterator();
    	Vehicule v = null;
    	while(it.hasNext()) {
    		v = it.next();
    	}
    	
    	if( v!=null&& !it.hasNext()){
    		return true;
    	}
    	return false;
    }
    
    
    //Inserer un element
    public void Inserer(Vehicule v) {
    	list.add(v);
    }
    //Recuperer un element
    public Vehicule recupererElement(int index) {
    	return list.get(index);
    }
    //Supprimer un element
    public void supprimer(Vehicule v) {
    	list.remove(v);
    }
    //Rechercher un element
    public boolean rechercherElement(Vehicule v) {
    	return list.contains(v);
    }
    //Trier la liste
    public void trier(Comparator<Vehicule> cmp) {
    	list.sort(cmp);
    }
	@Override
	public int compare(Vehicule o1, Vehicule o2) {
		// TODO Auto-generated method stub
		if(o1.getAnneeFabrication() > o2.getAnneeFabrication())
			return 1;
		else if(o1.getAnneeFabrication() < o2.getAnneeFabrication())
			return -1;
		else
			return 0;
	}
    
    //Copier la liste dans un nouveau tableau
	
	public ArrayList<Vehicule> copierList() {
		ArrayList<Vehicule> list2= new ArrayList<Vehicule>();
		list2.addAll(list);
		return list2;
	}
	//Melanger les elements de la liste
	public void melangerList() {
		Collections.shuffle(list);
	}	
	//Inverser les elements de la liste
	public void Inverser() {
		Collections.reverse(list);
	}
	//Extraire une partie de la liste
	public List <Vehicule> extrairePartofList(int debut, int fin) {
		if(debut > fin || debut < 0) {
			throw new IllegalArgumentException();
		}
		return list.subList(debut, fin);
	}
	//Comparer deux listes
	public boolean comparerList(List<Vehicule> list2)
	{
		return list.equals(list2);
	}
	//echanger 2 elements d'une list
	public void echangerList(int index1, int index2) {
		Collections.swap(list, index1, index2);	
	}
	//vider la liste
	public void Vider() {
		list.clear();
	}
	//verification de la liste
	public boolean estVide() {
		return list.isEmpty();
	}
    
    
    
    
    
    
    
}
