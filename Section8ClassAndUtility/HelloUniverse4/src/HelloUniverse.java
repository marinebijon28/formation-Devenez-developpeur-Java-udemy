import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {
        Planete mercure = new PlaneteTellurique("Mercure", 1);
        mercure.diametre = 4880;

        Planete venus = new PlaneteTellurique("Venus", 1);
        venus.diametre = 12100;

        Planete terre = new PlaneteTellurique("Terre", 4);
        terre.diametre = 12756;

        Planete mars = new PlaneteTellurique("Mars", 1);
        mars.diametre = 6792;

        Planete jupiter = new Planete("Jupiter");
        jupiter.diametre = 142984;

        Planete saturne = new Planete("Saturne");
        saturne.diametre = 120536;

        Planete uranus = new Planete("Uranus");
        uranus.diametre = 51118;

        Planete neptune = new Planete("Neptune");
        neptune.diametre = 49532;

        Galaxie galaxy = new Galaxie();
        galaxy.planetes.add(mercure);
        galaxy.planetes.add(venus);
        galaxy.planetes.add(terre);
        galaxy.planetes.add(mars);
        galaxy.planetes.add(jupiter);
        galaxy.planetes.add(saturne);
        galaxy.planetes.add(uranus);
        galaxy.planetes.add(neptune);


        Vaisseau civile = null;
        TypeVaisseau vaisseau = null;
        Scanner scan = new Scanner(System.in);
        boolean bool = true;
        int planet = 0;
        PlaneteTellurique tellurique = null;
        int quantity = 0;
        String restart = null;
        String type = null;
        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        Vaisseau chasseur1 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        Vaisseau chasseur2 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        tellurique = new PlaneteTellurique("Terre", 3);
        tellurique.accueillirVaisseaux(cargo, chasseur1,  chasseur2);

        do {
            System.out.println("Pour utiliser un vaisseau rentrez son type :");
            type = scan.nextLine();
            vaisseau =  TypeVaisseau.valueOf(type);
            if (vaisseau.nom.equalsIgnoreCase("Vaisseau-Monde") ||
                    vaisseau.nom.equalsIgnoreCase("Cargo"))
                civile = new VaisseauCivil(vaisseau);
            else
                civile = new VaisseauDeGuerre(vaisseau);
            civile.nbPassagers = 1;

            System.out.println("Pour accoster une planète rentrez son index (0 -> mercure, " +
                    "1 -> venus, 2 -> terre, 3 -> mars)");
            planet = scan.nextInt();
            scan.nextLine();

            switch (planet) {
                case 0 :
                case 1 :
                case 2 :
                case 3 :
                    if (tellurique == null)
                        tellurique = (PlaneteTellurique)galaxy.planetes.get(planet);
                    if ((galaxy.planetes.get(planet).nom != tellurique.nom))
                        tellurique = (PlaneteTellurique)galaxy.planetes.get(planet);
                    if (tellurique.restePlaceDisponible(civile)) {
                        tellurique.accueillirVaisseaux(civile);
                        System.out.println("Quelle quantité voulez-vous embarquer sur votre vaisseau :");
                        quantity = scan.nextInt();
                        System.out.println(civile.emporterCargaison(quantity));
                        scan.nextLine();
                    }
                    break;
                default :
                    System.out.println("\nVotre vaisseau ne peut pas accoster");
                    break;
            }

         /*   if (planet.equalsIgnoreCase( "Mercure") || planet.equalsIgnoreCase("Venus") ||
                    planet.equalsIgnoreCase("Terre") || planet.equalsIgnoreCase("Mars"))
            {
                if (tellurique == null) {
                    tellurique = new PlaneteTellurique(planet, 1);
                }
                else if (!tellurique.nom.equalsIgnoreCase(planet)) {
                    tellurique = new PlaneteTellurique(planet, 1);
                }
            }
            if (planet.equalsIgnoreCase( "Mercure") || planet.equalsIgnoreCase("Venus") ||
                    planet.equalsIgnoreCase("Terre") || planet.equalsIgnoreCase("Mars"))
            {
                if (tellurique.restePlaceDisponible(civile)) {
                    tellurique.accueillirVaisseaux(civile);
                    System.out.println("Quelle quantité voulez-vous embarquer sur votre vaisseau :");
                    quantity = scan.nextInt();
                    System.out.println(civile.emporterCargaison(quantity));
                    scan.nextLine();
                }
            }
            else {
                System.out.println("\nVotre vaisseau ne peut pas accoster");
            }*/
            System.out.println("Voulez-vous recommencer oui/non ?");
            restart = scan.nextLine();
            if (restart.equalsIgnoreCase("non"))
                bool = false;
        } while (bool);
    }
}


