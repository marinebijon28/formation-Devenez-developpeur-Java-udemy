import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {
        Planete mercure = new Planete("Mercure");
        mercure.diametre = 4880;

        Planete venus = new Planete("Venus");
        venus.diametre = 12100;

        Planete terre = new Planete("Terre");
        terre.diametre = 12756;

        Planete mars = new Planete("Mars");
        mars.diametre = 6792;

        Planete jupiter = new Planete("Jupiter");
        jupiter.diametre = 142984;

        Planete saturne = new Planete("Saturne");
        saturne.diametre = 120536;

        Planete uranus = new Planete("Uranus");
        uranus.diametre = 51118;

        Planete neptune = new Planete("Neptune");
        neptune.diametre = 49532;

        Scanner scan = new Scanner(System.in);
        System.out.println("Pour utiliser un vaisseau rentrez son type :");
        String type = scan.nextLine();
        TypeVaisseau vaisseau =  TypeVaisseau.valueOf(type);
        Vaisseau civile;
        if (vaisseau.nom.equalsIgnoreCase("Vaisseau-Monde") ||
                vaisseau.nom.equalsIgnoreCase("Cargo"))
            civile = new VaisseauCivil(vaisseau);
        else
            civile = new VaisseauDeGuerre(vaisseau);
        civile.nbPassagers = 1;

        System.out.println("Pour accoster une planète rentrez son nom :");
        String planet = scan.nextLine();
        PlaneteGazeuse gazeuse = null;
        PlaneteTellurique tellurique = null;
        if (planet.equalsIgnoreCase( "Mercure") || planet.equalsIgnoreCase("Venus") ||
                planet.equalsIgnoreCase("Terre") || planet.equalsIgnoreCase("Mars"))
        {
            tellurique = new PlaneteTellurique(planet);
        }
        else if (planet.equalsIgnoreCase("Jupiter") || planet.equalsIgnoreCase("Saturne") ||
                planet.equalsIgnoreCase("Uranus") || planet.equalsIgnoreCase("Neptune"))
        {
            gazeuse = new PlaneteGazeuse(planet);
        }
        System.out.println("Quelle quantité voulez-vous embarquer sur votre vaisseau :");
        int quantity = scan.nextInt();
        if (planet.equalsIgnoreCase( "Mercure") || planet.equalsIgnoreCase("Venus") ||
                planet.equalsIgnoreCase("Terre") || planet.equalsIgnoreCase("Mars"))
        {
            tellurique.accueillirVaisseau(civile);
            System.out.println(civile.emporterCargaison(quantity));
        }
        else {
            System.out.println("Votre vaisseau ne peut pas accoster");
        }

    }

}


