package Services;

import Combat.Combat;
import actors.Humain;
import actors.Monstre;
import actors.ScrumMaster;

public class Main {
	public static void main(String[] args) {
		System.out.println("bonjour");

		/*
		 * Vous êtes l’élu de la tribu des Y’oudevh, choisit parmi l’élite pour vaincre
		 * l’héritier du mal : le grand Mah’ven. Quel est votre nom, vaillant héros ?
		 * Rentrer nom* Très bien, *nom* ! Veuillez à présent choisir votre spécialité :
		 * Choisir classe* C’est donc vous le grand *classe* ? Je suis honoré de vous
		 * rencontrer ! Vous entrez à présent dans la jungle In’Telliji gouvernée par le
		 * grand Mah’ven. Tandis que vous vous frayez un chemin à travers les
		 * feuillages, un monstre surgit ! Sapristi ! C’est le gobelin Grit Ub, premier
		 * serviteur de Mah’ven ! Grit Ub veut se battre. Début du combat* Grit Ub a les
		 * attaques push, pull et commit* Grit Ub tombe au combat dans un râle d’agonie.
		 * Le gobelin protégeait une caverne menant vers la tour de Mah’ven. Vous
		 * pénétrez dans la caverne où un souffle glacé vous parcoure l’échine. Vous
		 * vous retournez pour découvrir la source de ce grand froid. Sorcellerie !
		 * C’est le mage Hubert Nate, le sorcier de Mah’ven ! Hubert Nate veut se
		 * battre. Début du combat* Hubert Nate a les attaques DELETE et CASCADE* Hubert
		 * Nate vaincu, vous enjambez son corps et progressez jusqu’au sommet de la
		 * tour. Mah’ven vous attend dans ses quartiers. Il ricane d’un rire aussi
		 * maléfique que tonitruant et le combat s’engage. Mah’ven veut se battre. Début
		 * du combat* Mah’ven a les attaques POM, Coup de POJO, Pluie de Plugins* Bravo,
		 * Mah’ven est vaincu ! Grâce à vous, la paix retourne sur les terres des
		 * Y’oudevh. Vos exploits seront célébrés jusqu’à la fin des temps.
		 */
		Monstre monstre = new Monstre(1,20,5,"Monstre");
		ScrumMaster scrum = new ScrumMaster("héros");
		Combat combat = new Combat(monstre, scrum);
		combat.Fight();
	}
}