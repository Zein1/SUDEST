package competences;

import actors.EtreVivant;


public class Competence {
	String nom;
	String description;
	int puissance;
	int cout;
	int touche;

	public Competence() {
		nom = "Nom de la compétence";
		description = "Description de cette compétence";
		puissance = 5;
		cout = 2;
		touche = 1;
	}

	public Competence(String cNom, String cDescription, int cPuissance, int cCout, int cTouche) {
		nom = cNom;
		description = cDescription;
		puissance = cPuissance;
		cout = cCout;
		touche = cTouche;
	}

	public int autreEffet(Humain humain, Monstre monstre, Competence competence) {
		System.out.println(monstre.nom + " reçoit " + competence.puissance + " dégât(s) !");
		return (0);
	}
}
