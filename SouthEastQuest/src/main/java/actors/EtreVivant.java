package actors;

public abstract class EtreVivant {
	int level;
	int hp;
	int atk;	String nom;


	public EtreVivant(int level, int hp, int atk, String nom) {
		this.level = level;
		this.hp = hp;
		this.atk = atk;
		this.nom = nom;
	}


	/* Inflige 'degats' aux hp
	 * Renvoie TRUE si encore vivant, renvoie FALSE si mort
	 */
	public boolean calculDegats(int degats)
	{
		degats = degats - def;
		hp = hp-degats;
		if (hp < 0)
		{
			return false;
		}

		return true;


	}

}
