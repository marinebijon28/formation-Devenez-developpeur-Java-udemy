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
    public int emporterCargaison(int tonnage) throws DepassementTonnageException {
        int rejeter = 0;
        switch (type.nom) {
            case "Vaisseau-monde" :
                rejeter = tonnagePersonne(tonnage);
                break;
            case "Cargo" :
                rejeter = tonnagePersonne(tonnage);
                break;
        }
        if (rejeter > 0) {

            throw new DepassementTonnageException(rejeter);
        }
        return rejeter;
    }
}
