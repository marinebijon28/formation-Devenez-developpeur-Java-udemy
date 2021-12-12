import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;

        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        /*VaisseauDeGuerre chasseur = new VaisseauDeGuerre("CHASSEUR");
        VaisseauDeGuerre fregate = new VaisseauDeGuerre("FREGATE");
        VaisseauDeGuerre croiseur = new VaisseauDeGuerre("CROISEUR");
        VaisseauCivil vaisseau = new VaisseauCivil("VAISSEAU-MONDE");
        VaisseauCivil cargo = new VaisseauCivil("CARGO");

        chasseur.nbPassagers = 1;
        fregate.nbPassagers = 1;
        croiseur.nbPassagers = 1;
        vaisseau.nbPassagers = 1;
        cargo.nbPassagers = 1;*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Pour utiliser un vaisseau rentrez son type :");
        String type = scan.nextLine();
        VaisseauCivil civile = null;
        VaisseauDeGuerre guerre = null;
        if (type.equalsIgnoreCase("VAISSEAU-MONDE") || type.equalsIgnoreCase("CARGO"))
        {
            civile = new VaisseauCivil(type);
            civile.nbPassagers = 1;
        }
        else if (type.equalsIgnoreCase("CHASSEUR") || type.equalsIgnoreCase("FREGATE") ||
                type.equalsIgnoreCase("CROISEUR"))
        {
            guerre = new VaisseauDeGuerre(type);
            guerre.nbPassagers = 1;
        }
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
            if (type.equalsIgnoreCase("VAISSEAU-MONDE") || type.equalsIgnoreCase("CARGO"))
            {
                tellurique.accueillirVaisseau(civile);
                System.out.println(civile.emporterCargaison(quantity));
            }
            else if (type.equalsIgnoreCase("CHASSEUR") || type.equalsIgnoreCase("FREGATE") ||
                    type.equalsIgnoreCase("CROISEUR"))
            {
                tellurique.accueillirVaisseau(guerre);
                System.out.println(guerre.emporterCargaison(quantity));
            }

        }
        else {
            System.out.println("Votre vaisseau ne peut pas accoster");
        }

    }
}


