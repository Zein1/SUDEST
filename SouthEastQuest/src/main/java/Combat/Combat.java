package Combat;

import actors.Humain;
import actors.Monstre;
import java.io.*;
import java.util.Scanner;

public class Combat {
    Monstre monstre;
    Humain  humain;
    public static Scanner sn = new Scanner(System.in);
    public static String choixAttaque = sn.nextLine();

    public Combat(Monstre monstre, Humain humain){
        this.humain = humain;
        this.monstre = monstre;
    }

    public void Fight(){
        while(humain.getHp() != 0){
            while(monstre.getHp() != 0){

                int nbrTour = 0;

                if(nbrTour %2 == 0) {
                    System.out.println("C'est votre tour ! Veullez choisir une attaque : \r\n");
                    System.out.println(1+" - Attaque de base             "+2+" - Spécialisation");

                    String choixAttaque = sn.nextLine();
                    if (choixAttaque.equals("1")) {
                        humain.calculDegats(humain.getAtk());
                        System.out.println("Vous avez infligé " + humain.getAtk() + " de dégâts");
                        System.out.println("Le monstre a "+monstre.getHp());
                    }
                    else if (choixAttaque.equals("2"))
                    {
                        humain.spell(nbrTour);
                    }
                    else if (choixAttaque.equals("1") && choixAttaque.equals("2"))
                    {
                        System.out.println("Veuillez choisir une attaque ci dessous ");
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
        FinDeTour();
    }

    public boolean FinDeTour()
    {
        if(humain.getHp() <= 0)
        {
            System.out.println("Vous avez perdu le combat ! Vous êtes nul...");
            return false;
        }
        if(monstre.getHp() <= 0)
        {
            System.out.println("Bravo ! Vous avez terrassé votre ennemi !");
            humain.levelUP();
        }
        return true;
    }
}