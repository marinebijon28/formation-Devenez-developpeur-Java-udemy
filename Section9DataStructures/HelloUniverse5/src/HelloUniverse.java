import java.util.Iterator;
import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {
        Planete mercure = new PlaneteTellurique("Mercure", 1);
        mercure.diametre = 4880;

        Planete venus = new PlaneteTellurique("Venus", 1);
        venus.diametre = 12100;

        Planete terre = new PlaneteTellurique("Terre", 0);
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
        String planet = null;
        PlaneteTellurique tellurique = null;
        int quantity = 0;
        String restart = null;
        String type = null;
        Iterator<Planete> it = galaxy.planetes.iterator();
        Planete planete = null;

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

            System.out.println("Pour accoster une plan??te rentrez son index (Mercure, " +
                    "Venus, Terre, Mars)");
            planet = scan.nextLine();
            switch (planet) {
                case "Mercure" :
                case "Venus" :
                case "Terre" :
                case "Mars" :
                    do {
                        planete = it.next();
                        System.out.println(planete.nom);
                        if (tellurique == null) {
                            if (planet.equalsIgnoreCase(planete.nom)) {
                                tellurique = (PlaneteTellurique)planete;
                                break;
                            }
                        }
                        else {
                            System.out.println(tellurique.nom);
                            if ((planet.equalsIgnoreCase(tellurique.nom) == false) &&
                                    planet.equalsIgnoreCase(planete.nom)) {
                                tellurique = (PlaneteTellurique) planete;
                                break;
                            }
                        }
                    } while (it.hasNext());
                    System.out.println("select :" + tellurique.nom);
                    if (tellurique.restePlaceDisponible(civile)) {
                        tellurique.accueillirVaisseaux(civile);
                        System.out.println("Quelle quantit?? voulez-vous embarquer sur votre vaisseau :");
                        quantity = scan.nextInt();
                        System.out.println(civile.emporterCargaison(quantity));
                        scan.nextLine();
                    }
                    break;
                default :
                    System.out.println("Votre vaisseau ne peut pas accoster");
                    break;
            }
            System.out.println("Voulez-vous recommencer oui/non ?");
            restart = scan.nextLine();
            if (restart.equalsIgnoreCase("non"))
                bool = false;
        } while (bool);
    }
}


