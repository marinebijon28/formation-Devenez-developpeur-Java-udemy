package com.espacex.decouverte.enginsspatiaux;

public abstract class Vaisseau {
    final TypeVaisseau type;
    public int nbPassagers;
    int blindage;
    int resistanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;

    public Vaisseau(TypeVaisseau type) {
        this.type = type;
    }


    public Vaisseau(String type, int blindage) {
        this.type = TypeVaisseau.valueOf(type);
        this.blindage = blindage;
    }

    public Vaisseau(String type, int blindage, int resistanceBouclier) {
        this.type = TypeVaisseau.valueOf(type);
        this.blindage = blindage;
        this.resistanceDuBouclier = resistanceBouclier;
    }

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
    }

    void desactiverBouclier(){
        System.out.println("désactivation du bouclier d'un vaisseau de type " + type);
    }

    protected int tonnagePersonne(int tonnage) {
        int difference;
        int rejeter = 0;

        if (type.nom != "com.espacex.com.espacex.com.espacex.decouverte.enginsspatiaux.Vaisseau-Monde" && type.nom != "Cargo")
        {
            if (nbPassagers < 12)
                return tonnage + tonnageActuel;
            if ((tonnage + tonnageActuel) < (nbPassagers * 2) && (tonnage + tonnageActuel) < tonnageMax) {
                rejeter = 0;
            }
            else if ((tonnage + tonnageActuel) > tonnageMax){
                rejeter = (tonnage + tonnageActuel) - tonnageMax;
            }
            else {
                rejeter = (tonnage + tonnageActuel) - (nbPassagers * 2);
            }
            tonnageActuel += tonnage - rejeter;
        }
        else {
            difference = (tonnage + tonnageActuel);
            if (difference < tonnageMax){
                rejeter = 0;
            }
            else {
                rejeter = (difference) - tonnageMax;
            }
            tonnageActuel = (tonnage - tonnageActuel) - rejeter;
        }
        return rejeter;
    }

    public abstract int emporterCargaison(int tonnage);
}
