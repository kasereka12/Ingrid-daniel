package TP;

import java.util.Objects;

public class Vehicule implements Comparable<Vehicule>{
	
	//les attributs de notre classe mere
	private String numeroMatricule; 
	private String type;
	private String marque;
	private String couleur;
	private int anneeFabrication;
	private Double poids;
	private Double vitesse;
	
	//constructeur avec parametre de notre classe vehicule
	public Vehicule(String numeroMatricule, String type, String marque, String couleur, int anneeFabrication,
			Double poids, Double vitesse) {
	
		this.numeroMatricule = numeroMatricule;
		this.type = type;
		this.marque = marque;
		this.couleur = couleur;
		this.anneeFabrication = anneeFabrication;
		this.poids = poids;
		this.vitesse = vitesse;
	}
	
	public int getAnneeFabrication() {
		return anneeFabrication;
	}

	@Override
	public String toString() {
		return "Vehicule [numeroMatricule=" + numeroMatricule + ", type=" + type + ", marque=" + marque + ", couleur="
				+ couleur + ", anneeFabrication=" + anneeFabrication + ", poids=" + poids + ", vitesse=" + vitesse
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		if(obj.getClass()!=this.getClass()) {
			return false;
		}
		Vehicule other = (Vehicule)obj;
		//pour comparer ces objets par type, il faut donc utiliser la classe 
		//Objects c'est une classe mere de toute les autres classe
		return Objects.equals(numeroMatricule,other.numeroMatricule);
	}

	@Override
	public Vehicule clone(){
		try {
			return (Vehicule)super.clone();
		}catch(Exception e) {
			System.out.println("Une erreur de clonage s'est produite \n"+e.getMessage());
			return null;
		}
	}

	@Override
	public int compareTo(Vehicule o) {
		//lors de l'utilisation de l'interface Comparable on doit toujours 
		//preciser le type de la classe comparable ex: Comaparable <Vehicule>
		//lors qu'on l'implement
		return this.numeroMatricule.compareTo(o.numeroMatricule);	
	}		
}
