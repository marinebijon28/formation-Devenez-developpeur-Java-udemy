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

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseur);
        System.out.println(chasseur.emporterCargaison(20));
        VaisseauDeGuerre fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 100;
        terre.accueillirVaisseau(fregate);
        System.out.println(fregate.emporterCargaison(45));
        System.out.println(fregate.emporterCargaison(12));
        VaisseauDeGuerre fregate1 = new VaisseauDeGuerre("FREGATE");
        fregate1.nbPassagers = 14;
        terre.accueillirVaisseau(fregate1);
        System.out.println(fregate1.emporterCargaison(30));
        VaisseauCivil vaisseau = new VaisseauCivil("VAISSEAU-MONDE");
        terre.accueillirVaisseau(vaisseau);
        System.out.println(vaisseau.emporterCargaison(1560));
        System.out.println(vaisseau.emporterCargaison(600));
    }
}


