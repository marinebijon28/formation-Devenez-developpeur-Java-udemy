public class VaisseauDeGuerre extends Vaisseau{
    String arme;
    int duree;
    public boolean armesDesactivees = true;

    public VaisseauDeGuerre(String type) {
        super(type);
        switch (type) {
            case "CHASSEUR" :
                tonnageMax = 0;
                tonnageActuel = 0;
                break;
            case "FREGATE" :
                tonnageMax = 50;
                break;
            case "CROISEUR" :
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
        switch (type) {
            case "CHASSEUR" :
                rejeter = tonnage + tonnageActuel;
                break;
            case "FREGATE" :
                rejeter = tonnagePersonne(tonnage);
                break;
            case "CROISEUR" :
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
