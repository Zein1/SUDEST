package actors;


import java.util.List;

import competences.Competence;

public class Humain extends EtreVivant{

	public Humain(int level, int hp, int atk, String nom) {
		super(level, hp, atk, nom);
		
	}
	
	public void levelUP()
	{
		level = level + 1;
	}
}
