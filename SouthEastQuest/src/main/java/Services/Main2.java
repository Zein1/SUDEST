package Services;

import Combat.Combat;
import actors.Monstre;
import actors.ScrumMaster;
import Combat.*;

public class Main2 {
    public static void main(String[] args) {
        Monstre monstre = new Monstre(1, 20, 5, "Monstre");
        ScrumMaster scrum = new ScrumMaster("héros");
        Combat combat = new Combat(monstre, scrum);
        combat.Fight();
    }
}
