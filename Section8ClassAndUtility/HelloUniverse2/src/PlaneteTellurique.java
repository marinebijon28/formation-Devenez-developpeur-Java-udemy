public class PlaneteTellurique extends Planete implements Habitable{
    int totalVisiteurs;
    Vaisseau[] vaisseauxAccostes;

   /* public PlaneteTellurique(String nom) {
        super(nom);
    }*/
    public PlaneteTellurique(String nom, int baie) {
        super(nom);
        this.vaisseauxAccostes = new Vaisseau[baie];
    }

    // surcharge
    void accueillirVaisseau(int numberHuman){
        totalVisiteurs += numberHuman;
    }

    void accueillirVaisseau(String vaisseau) {
        switch (vaisseau){
            case "CHASSEUR" :
                totalVisiteurs += 3;
                break;
            case "FREGATE" :
                totalVisiteurs += 12;
                break;
            case "CROISEUR" :
                totalVisiteurs += 50;
                break;
            default :
                break;
        }
        System.out.println("Le nombre d'humains ayant déjà séjourner sur " + nom + " est actuellement de " + totalVisiteurs);
    }

    Boolean restePlaceDisponible(){
        for (int i = 0; i < this.vaisseauxAccostes.length; i++){
            if (this.vaisseauxAccostes[i] == null){
                return true;
            }
        }// pt a enlever
        System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie");
        return false;
    }

    @Override
    public Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        for (int i = 0; i < this.vaisseauxAccostes.length; i++){
            if (this.vaisseauxAccostes[i] == null){
                this.vaisseauxAccostes[i] = vaisseau;
                return this.vaisseauxAccostes[i];
            }
        }
        return this.vaisseauxAccostes[this.vaisseauxAccostes.length - 1];
        /*if (vaisseau instanceof VaisseauDeGuerre && ((VaisseauDeGuerre)vaisseau).armesDesactivees == false)
            ((VaisseauDeGuerre) vaisseau).desactiverArmes();
        if (this.vaisseauAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("Un vaisseau de type " +  this.vaisseauAccoste.type + " doit s'en aller");
        }

        Vaisseau vaisseauPrecedent = this.vaisseauAccoste;
        this.vaisseauAccoste = vaisseau;

        totalVisiteurs+=vaisseau.nbPassagers;

        return vaisseauPrecedent;
*/
    }
}
