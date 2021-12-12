public abstract class Vaisseau {
    String type;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;

    public Vaisseau() {
    }
    public Vaisseau(String type) {
        this.type = type;
    }


    public Vaisseau(String type, int blindage) {
        this.type = type;
        this.blindage = blindage;
    }

    public Vaisseau(String type, int blindage, int resistanceBouclier) {
        this.type = type;
        this.blindage = blindage;
        this.resistanceDuBouclier = resistanceBouclier;
    }

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
    }

    void desactiverBouclier(){
        System.out.println("désactivation du bouclier d'un vaisseau de type " + type);
    }

    int tonnagePersonne(int tonnage) {
        int difference;
        int rejeter = 0;
        if (nbPassagers < 15 && (type != "VAISSEAU-MONDE" && type != "CARGO")) {
            if (tonnageActuel < nbPassagers * 2) {
                // si tonnage + tonnageactuel < nb passager * 2
                difference = tonnage - (nbPassagers * 2 - tonnageActuel);
                if ((tonnage + tonnageActuel) < nbPassagers * 2) {
                    rejeter = 0;
                }
                else {
                    // je rejete le surplus
                    rejeter = difference;
                }
                tonnageActuel += tonnage - rejeter;
            }
            // si le tonnage actuel > nbPassager * 2
            else {
                tonnageActuel = (tonnageActuel - (nbPassagers * 2));
                rejeter = (tonnageActuel - (nbPassagers * 2)) + tonnage;
            }
        }
        else {
            difference = (tonnage + tonnageActuel);
            // tonneage - tonnageActuel < tonnageMax
            if (difference < tonnageMax){
                rejeter = 0;
            }
            // tonnage - tonnnageActuel > tonnageMax
            else {
                rejeter = (difference) - tonnageMax;

            }
            tonnageActuel = (tonnage - tonnageActuel) - rejeter;
        }

        return rejeter;
    }

    abstract int emporterCargaison(int tonnage);
}
