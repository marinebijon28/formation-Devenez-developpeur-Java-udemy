package com.espacex.decouverte.enginsspatiaux;

public class VaisseauDeGuerre extends Vaisseau{
    String arme;
    int duree;
    public boolean armesDesactivees = true;

    public VaisseauDeGuerre(TypeVaisseau type) {
        super(type);
        switch (type.nom) {
            case "Chasseur" :
                tonnageMax = 0;
                tonnageActuel = 0;
                break;
            case "Frégate" :
                tonnageMax = 50;
                break;
            case "Croiseur" :
                tonnageMax = 100;
                break;
        }
    }

    public VaisseauDeGuerre(String type, int blindage) {
        super(type, blindage);
    }

    void attaque(Vaisseau vaisseau, String arme, int duree){
        if (armesDesactivees == false) {
            System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s" +
                    " pendant %d minutes\n", this.type, vaisseau.type, arme, duree);
            vaisseau.resistanceDuBouclier = 0;
            vaisseau.blindage = 2392;
        }
        else {
            armesDesactivees = false;
            System.out.println("Attaque impossible, l'armement désactivé");
        }
    }

    void activerBouclier(){
        armesDesactivees = true;
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
    }



    @Override
    int emporterCargaison(int tonnage) {
        int rejeter = 0;
        switch (type.nom) {
            case "Chasseur" :
                rejeter = tonnage + tonnageActuel;
                break;
            case "Frégate" :
                rejeter = tonnagePersonne(tonnage);
                break;
            case "Croiseur" :
                rejeter = tonnagePersonne(tonnage);
                break;
        }
        return rejeter;
    }

    boolean desactiverArmes(){
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        return true;
    }

}
