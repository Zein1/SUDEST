package Combat;

import actors.Humain;
import actors.Monstre;
import java.io.*;
import java.util.Scanner;

public class Combat {
    Monstre monstre;
    Humain  humain;
    public static Scanner sn = new Scanner(System.in);

    public Combat(Monstre monstre, Humain humain){
        this.humain = humain;
        this.monstre = monstre;
    }

    public void Fight(){
        while(humain.calculDegats(0)){
            while(monstre.calculDegats(0)){

                int nbrTour = 0;

                if(nbrTour %2 == 0) {
                    System.out.println("C'est votre tour ! Veullez choisir une attaque : \r\n");
                    System.out.println();

                    if (sn.nextLine() == "1") {
                        humain.calculDegats(humain.getAtk());
                        System.out.println("Vous avez infligé " + humain.getAtk() + " de dégâts");
                    }
                    else if (sn.nextLine() == "2")
                    {
                        humain.spell(nbrTour);
                    }
                    else if (sn.nextLine() != "1" && sn.nextLine() != "2")
                    {
                        System.out.println("Veuillez choisir une attaque ");
                    }
                    System.out.println("C'est au tour de " + monstre.getNom());
                    nbrTour++;
                }
                else if(nbrTour %2 == 1)
                {
                    monstre.calculDegats(monstre.getAtk());
                    System.out.println("Attention ! le monstre vous a infligé "+monstre.getAtk() +" de dégâts.");
                    System.out.println("Il vous reste " + humain.getHp() + " points de vie");
                    nbrTour++;
                }
            }

        }
    }
}





