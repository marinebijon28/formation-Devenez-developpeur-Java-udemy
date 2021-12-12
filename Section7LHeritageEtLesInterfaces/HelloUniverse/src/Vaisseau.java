public class Vaisseau {
    String type;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;

    public Vaisseau() {
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
}
