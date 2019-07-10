package actors;

public class ProjectOwner extends Humain{

	int nbUtilisationSpell;
	public ProjectOwner(String nom) {
		super(1, 80, 13, nom);
		nbUtilisationSpell = 3;
	}

	private boolean appelSousFiffre()
	{
		if (nbUtilisationSpell == 0)
		{
			atk = atk + atk;
			nbUtilisationSpell = nbUtilisationSpell - 1;
		}
		else
		{
			return false;
		}
		
		return true;
	}
	
	public void spell()
	{
		appelSousFiffre();
	}
	
	public void reset()
	{
		nbUtilisationSpell = 3;
		atk = 13;
		hp = 80;
	}

}
