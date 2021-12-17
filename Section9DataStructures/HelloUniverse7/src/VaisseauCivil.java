public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil() {
    }

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
    int emporterCargaison(int tonnage) {
        int rejeter = 0;
        switch (type.nom) {
            case "Vaisseau-monde" :
                rejeter = tonnagePersonne(tonnage);
                break;
            case "Cargo" :
                rejeter = tonnagePersonne(tonnage);
                break;
        }

        return rejeter;
    }
}
