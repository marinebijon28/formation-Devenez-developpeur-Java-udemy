public class Planete {
    // property / attribute / instantiate variable
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseau;
    static String forme = "Sphérique";

    // methods
    int numberTurn(int angle)
    {
        if (angle >= 0)
            return angle / 360;
        else
            return ((angle * -1) / 360 * -1);
    }

    int revolution(int angle) {
        int turn = numberTurn(angle);
        System.out.println(nom + " a effectué " + turn + " tours complets autour de son étoile.");
        return turn;
    }

    int rotation(int angle)
    {
        int turn = numberTurn(angle);
        System.out.println(nom + " a effectué " + turn + " tours complets sur elle-même.");
        return turn;
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

    Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        if (this.vaisseau == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("Un vaisseau de type " +  this.vaisseau.type + " doit s'en aller");
        }

        Vaisseau vaisseauPrecedent = this.vaisseau;
        this.vaisseau = vaisseau;

        totalVisiteurs+=vaisseau.nbPassagers;

        return vaisseauPrecedent;
    }
}