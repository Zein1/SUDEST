package actors;

public abstract class EtreVivant {
	int level;
	int hp;
	int atk;
	int def;


	public EtreVivant(int level, int hp, int atk, int def) {
		this.level = level;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
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
