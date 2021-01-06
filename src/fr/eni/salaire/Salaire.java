package fr.eni.salaire;

import java.util.Scanner;

public class Salaire {

	String nom;
	String prénom;
	String statut;
	static int nbrHeure;
	static int tauxHoraire;
	static int nbrEnfant;
	static double salaireBrut;
	static double salaireNet;
	static double totalCotisations;
	static int prime;

	public static void main(String[] args) {

		System.out.println("Quel est votre nom?");
		String nom = scannerString();
		System.out.println("Quel est votre prénom?");
		String prénom = scannerString();
		System.out.println("Combien d'enfants avez-vous?");
		int nbrEnfant = scannerInt();
		System.out.println("Quel est votre statut?");
		String statut = scannerString();
		System.out.println("Quelle est le nombre d'heure effectuée?");
		int nbrHeure = scannerInt();
		System.out.println("Quel est le taux horaire?");
		int tauxHoraire = scannerInt();

		if (nbrHeure < 169) {
			salaireBrut = nbrHeure * tauxHoraire;
		} else if (169 < nbrHeure && nbrHeure < 180) {
			salaireBrut = tauxHoraire * 50 / 100;
		} else {
			salaireBrut = tauxHoraire * 60 / 100;
		}

		double totalCotisations = salaireNet * 6.15 / 100 + salaireNet * 6.15 / 100 + salaireNet * 0.95 / 100
				+ salaireNet * 8.44 / 100 + salaireNet * 3.05 / 100 + salaireNet * 3.81 / 100 + salaireNet * 1.02 / 100;

		double salaireNet = salaireBrut - totalCotisations + calculPrimeEnfant();

		System.out.println("          			Fiche de paie");
		System.out.println("------------------------------------------------");
		System.out.println("					Etat Civil");
		System.out.println(nom);
		System.out.println(prénom);
		System.out.println(statut);
		System.out.println("------------------------------------------------");
		System.out.println("Nombre d'heure efféctuée :" + nbrHeure + "h");
		System.out.println("Taux horaire :" + tauxHoraire);
		System.out.println("------------------------------------------------");
		System.out.println("Salaire brut : " + salaireBrut + "€");
		System.out.println("------------------------------------------------");
		System.out.println("					Cotisations salariales");
		System.out.println("DSCSG :                 " + salaireNet * 3.49 / 100 + "€");
		System.out.println("SCG :                   " + salaireNet * 6.15 / 100 + "€");
		System.out.println("Assurance maladie :     " + salaireNet * 0.95 / 100 + "€");
		System.out.println("Assurance viellesse :   " + salaireNet * 8.44 / 100 + "€");
		System.out.println("Assurance chômage :     " + salaireNet * 3.05 / 100 + "€");
		System.out.println("RCEM :                  " + salaireNet * 3.81 / 100 + "€");
		System.out.println("AGFF : 				    " + salaireNet * 1.02 / 100 + "€");
		System.out.println("Total des cotisations : " + totalCotisations + "€");
		System.out.println("------------------------------------------------");
		System.out.println("					Prime enfant");
		System.out.println("Nombre d'enfant :" + nbrEnfant);
		System.out.println("Montant de la prime : " + prime + "€");
		System.out.println("------------------------------------------------");
		System.out.println("Salaire net :" + salaireNet + "€");
	}

	public static int calculPrimeEnfant() {
		switch (nbrEnfant) {
		case 0:
			System.out.println("Montant de la prime : 0€");
			break;
		case 1:
			prime = 20;
			System.out.println("Montant de la prime : " + prime);
			break;
		case 2:
			prime = 50;
			System.out.println("Montant de la prime : " + prime);
		default:
			prime = 70 + 20 * nbrEnfant;
			System.out.println("Montant de la prime : " + prime);
		}

		return prime;
	}

	public static String scannerString() {
		Scanner scanner = new Scanner(System.in);
		String saisie = scanner.next();
		return saisie;
	}

	public static int scannerInt() {
		Scanner scan = new Scanner(System.in);
		int saisie = scan.nextInt();
		return saisie;
	}
}
