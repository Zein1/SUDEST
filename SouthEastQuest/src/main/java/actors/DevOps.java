package actors;

import java.util.concurrent.ThreadLocalRandom;

public class DevOps extends Humain{

	private boolean proct;
	private int nbToursBack; // nb tour ou compétence a été utilisée
	public DevOps(String nom) {
		super(1, 120, 6, nom);
	}

	private boolean random(int nbTours)
	{
		int i = ThreadLocalRandom.current().nextInt(100);
		if (i < 45)
		{
			hp = hp + 30;
		}
		else
		{
			if (i > 90)
			{
<<<<<<< HEAD
				hp = hp - 5;
=======
				hp = hp - 10;
>>>>>>> dc7fa4408cfc09395aec834f6b2fec83267d73a2
			}
		}
		
		
		return true;
		
	}

	public boolean spell(int nbTours)
	{
		return random(nbTours);
	}
	
	public void reset()
	{
		atk = 6;
		hp = 120;
	}

	public boolean isprotected()
	{
		return proct;
	}
	
}
