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

        Atmosphere at = new Atmosphere();
        at.methane = Float.parseFloat("2.5f");
        at.hydrogène = Float.parseFloat("83f");
        at.helium = Float.parseFloat("15f");
        at.azote = Float.parseFloat("0.0f");
        uranus.atmosphere = at;
        System.out.printf("Taux d'hydrogène en %% : %2.1f\nTaux méthane en %% : %2.1f\nTaux d'azote en %% : %2.1f\n" +
                "Taux d'hélium en %% : %2.1f\nTaux d'argon en %% :\nTaux de carbone en %% :\n" +
                "Taux de sodium en %% :\n", at.hydrogène, at.methane, at.azote, at.helium );
    }
}


