public class Planete {
    // property / attribute / instantiate variable
    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes = 0;

    String nom;
    long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;


    public Planete(String nom)
    {
        this.nom = nom;
        ++nbPlanetesDecouvertes;
    }

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

    static String expansion(double distance) {
        if (distance < 14)
            return "Oh la la mais c'est super rapide! ";
        else
            return "Je rêve ou c'est plus rapide que la lumière ?";
    }


}
