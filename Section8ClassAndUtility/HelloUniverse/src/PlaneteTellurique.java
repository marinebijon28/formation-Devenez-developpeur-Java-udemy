public class PlaneteTellurique extends Planete implements Habitable{
    Vaisseau vaisseauAccoste;
    int totalVisiteurs;

    public PlaneteTellurique(String nom) {
        super(nom);
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

    @Override
    public Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        if (vaisseau instanceof VaisseauDeGuerre && ((VaisseauDeGuerre)vaisseau).armesDesactivees == false)
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

    }
}
