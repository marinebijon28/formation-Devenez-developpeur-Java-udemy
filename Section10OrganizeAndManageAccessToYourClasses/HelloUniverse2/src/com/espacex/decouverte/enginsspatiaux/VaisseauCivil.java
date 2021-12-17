package com.espacex.decouverte.enginsspatiaux;

public class VaisseauCivil extends Vaisseau {


    public VaisseauCivil(TypeVaisseau type) {
        super(type);
        switch (type.nom) {
            case "Vaisseau-monde" :
                tonnageMax = 2000;
                break;
            case "Cargo" :
                tonnageMax = 500;
                break;
        }
    }

    public VaisseauCivil(String type, int blindage, int resistanceBouclier) {
        super(type, blindage, resistanceBouclier);
    }

    @Override
    public int emporterCargaison(int tonnage) {
        int rejeter = 0;
        switch (type.nom) {
            case "com.espacex.com.espacex.com.espacex.decouverte.enginsspatiaux.Vaisseau-monde" :
                rejeter = tonnagePersonne(tonnage);
                break;
            case "Cargo" :
                rejeter = tonnagePersonne(tonnage);
                break;
        }

        return rejeter;
    }
}
