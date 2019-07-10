package actors;

public abstract class Humain extends EtreVivant{

	public Humain(int level, int hp, int atk, String nom) {
		super(level, hp, atk, nom);
		
	}
	
	public void levelUP()
	{
		level = level + 1;
	}
	
	public abstract boolean spell(int nbTours);
	
}
