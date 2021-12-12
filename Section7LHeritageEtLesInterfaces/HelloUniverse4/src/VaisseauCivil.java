public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil() {
    }

    public VaisseauCivil(String type) {
        super(type);
        switch (type) {
            case "VAISSEAU-MONDE" :
                tonnageMax = 2000;
                break;
            case "CARGO" :
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
        switch (type) {
            case "VAISSEAU-MONDE" :
                rejeter = tonnagePersonne(tonnage);
                break;
            case "CARGO" :
                rejeter = tonnagePersonne(tonnage);
                break;
        }

        return rejeter;
    }
}
