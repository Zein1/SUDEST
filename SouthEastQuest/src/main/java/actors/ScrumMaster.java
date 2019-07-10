package actors;

public class ScrumMaster extends Humain{

	int nbUtilisationSpell;
	public ScrumMaster(String nom) {
		super(1, 100, 10, nom);
		nbUtilisationSpell = 2;
	}
	
	private boolean potion()
	{
		
		if (nbUtilisationSpell != 0)
		{
			hp = hp + 50;
			nbUtilisationSpell = nbUtilisationSpell - 1;
		}
		else
		{
			return false;
		}
		
		return true;
	}
	
	public boolean spell()
	{
		return potion();
	}
	
	public void reset()
	{
		nbUtilisationSpell = 2;
		atk = 10;
		hp = 100;
	}

}
