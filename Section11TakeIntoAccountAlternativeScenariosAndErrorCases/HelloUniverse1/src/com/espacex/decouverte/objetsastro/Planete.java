package com.espacex.decouverte.objetsastro;

public class Planete implements Comparable{
    // property / attribute / instantiate variable
    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes = 0;

    public String nom;
    public long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;
    public float distanceEtoile;


    public Planete(String nom)
    {
        this.nom = nom;
        ++nbPlanetesDecouvertes;
    }

    // methods
    final int numberTurn(int angle)
    {
        if (angle >= 0)
            return angle / 360;
        else
            return ((angle * -1) / 360 * -1);
    }

    final int revolution(int angle) {
        int turn = numberTurn(angle);
        System.out.println(nom + " a effectué " + turn + " tours complets autour de son étoile.");
        return turn;
    }

    final int rotation(int angle)
    {
        int turn = numberTurn(angle);
        System.out.println(nom + " a effectué " + turn + " tours complets sur elle-même.");
        return turn;
    }

   final static String expansion(double distance) {
        if (distance < 14)
            return "Oh la la mais c'est super rapide! ";
        else
            return "Je rêve ou c'est plus rapide que la lumière ?";
    }


    @Override
    public int compareTo(Object o) {
        Planete planet = (Planete)o;
        if (planet.distanceEtoile < distanceEtoile)
            return 1;
        else if (planet.distanceEtoile > distanceEtoile)
            return -1;
        return 0;
    }
}
