public class VaisseauDeGuerre extends Vaisseau{
    String arme;
    int duree;

    public VaisseauDeGuerre() {
    }

    public VaisseauDeGuerre(String type, int blindage) {
        super(type, blindage);
    }

    void attaque(Vaisseau vaisseau, String arme, int duree){
        System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s" +
                " pendant %d minutes\n", this.type, vaisseau.type, arme, duree);

        vaisseau.resistanceDuBouclier = 0;
        vaisseau.blindage = 2392;
    }

}
