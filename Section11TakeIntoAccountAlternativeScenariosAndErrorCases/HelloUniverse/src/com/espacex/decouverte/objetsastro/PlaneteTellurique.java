package com.espacex.decouverte.objetsastro;

import com.espacex.decouverte.enginsspatiaux.Vaisseau;
import com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre;

public class PlaneteTellurique extends Planete implements Habitable{
    int totalVisiteurs;
    Vaisseau[][] vaisseauxAccostes;

   /* public com.espacex.com.espacex.com.espacex.com.espacex.decouverte.objetsastro.PlaneteTellurique(String nom) {
        super(nom);
    }*/
    public PlaneteTellurique(String nom, int baie) {
        super(nom);
        this.vaisseauxAccostes = new Vaisseau[2][baie];
    }

    // surcharge
    void accueillirVaisseau(int numberHuman){
        totalVisiteurs += numberHuman;
    }

    void accueillirVaisseau(String vaisseau) {
        switch (vaisseau){
            case "CHASSEUR" :
                totalVisiteurs += 3;
                break;
            case "FREGATE" :
                totalVisiteurs += 12;
                break;
            case "CROISEUR" :
                totalVisiteurs += 50;
                break;
            default :
                break;
        }
        System.out.println("Le nombre d'humains ayant déjà séjourner sur " + nom + " est actuellement de " + totalVisiteurs);
    }

    public Boolean restePlaceDisponible(Vaisseau vaisseau){
        int index = 0;
        if (vaisseau instanceof VaisseauDeGuerre) {
            index = 1;
        }
        for (int i = 0; i < this.vaisseauxAccostes[index].length; i++){
            if (this.vaisseauxAccostes[index][i] == null){
                return true;
            }
        }// pt a enlever
        System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie");
        return false;
    }

    @Override
    public Vaisseau accueillirVaisseaux(Vaisseau... vaisseau) {
        int index = 0;
        for (int i = 0; i < vaisseau.length; i++) {
            index = 0;
            if (vaisseau[i] instanceof VaisseauDeGuerre) {
                index = 1;
            }
         //   System.out.println(vaisseau[i].type.nom);
            for (int j = 0; j < this.vaisseauxAccostes[index].length; j++) {
                if (this.vaisseauxAccostes[index][j] == null) {
                    this.vaisseauxAccostes[index][j] = vaisseau[i];
                    break;
                }
            }
        }
        return this.vaisseauxAccostes[index][this.vaisseauxAccostes[index].length - 1];

        /*int j = 0;
        for (int i = 0; i < this.vaisseauxAccostes.length; i++) {
            if (this.vaisseauxAccostes[i] == null) {
                if (j < (vaisseau.length)) {
                    this.vaisseauxAccostes[i] = vaisseau[j];
                    j++;
                }
            }
        }
        return this.vaisseauxAccostes[this.vaisseauxAccostes.length - 1];*/
        /*if (vaisseau instanceof com.espacex.com.espacex.com.espacex.com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre && ((com.espacex.com.espacex.com.espacex.com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre)vaisseau).armesDesactivees == false)
            ((com.espacex.com.espacex.com.espacex.com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre) vaisseau).desactiverArmes();
        if (this.vaisseauAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("Un vaisseau de type " +  this.vaisseauAccoste.type + " doit s'en aller");
        }

        com.espacex.com.espacex.com.espacex.com.espacex.decouverte.enginsspatiaux.Vaisseau vaisseauPrecedent = this.vaisseauAccoste;
        this.vaisseauAccoste = vaisseau;

        totalVisiteurs+=vaisseau.nbPassagers;

        return vaisseauPrecedent;
*/
    }
}
