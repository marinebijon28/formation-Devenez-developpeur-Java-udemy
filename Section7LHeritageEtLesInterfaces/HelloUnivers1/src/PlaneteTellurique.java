public class PlaneteTellurique extends Planete implements Habitable{
    Vaisseau vaisseauAccoste;
    int totalVisiteurs;

    public PlaneteTellurique(String nom) {
        super(nom);
    }

    @Override
    public Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
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
