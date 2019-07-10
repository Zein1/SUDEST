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
		hp = hp-degats;
		if (hp < 0)
		{
			return false;
		}

		return true;


	}
	
	public int getAtk()
	{
		return atk;
	}
	
	public int getHp()
	{
		return hp;
	}

	public String getNom()
	{
		return nom;
	}
}
