public class VaisseauDeGuerre extends Vaisseau{
    String arme;
    int duree;
    public boolean armesDesactivees = true;

    public VaisseauDeGuerre() {
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
        else
            System.out.println("Attaque impossible, l'armement désactivé");
    }

    boolean desactiverArmes(){
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        return true;
    }

}
