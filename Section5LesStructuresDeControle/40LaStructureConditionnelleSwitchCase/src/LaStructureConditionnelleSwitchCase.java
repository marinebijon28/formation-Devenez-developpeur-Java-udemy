public class LaStructureConditionnelleSwitchCase {
    public static void main(String... args){
        int month = 1;

        switch (month){
            case 1 :
                System.out.println("Cest janvier");
                break;
            case 2 :
                System.out.println("Cest février");
                break;
            case 3 :
                System.out.println("Cest mars");
                break;
            default :
                System.out.println("Ce mois n'existe pas dans le calendrier");
        }

        switch(month) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("Cest l'hiver");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Cest le printemps");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println("Cest l'été");
                break;
            case 10 :
            case 11 :
            case 12 :
                System.out.println("Cest l'automne");
                break;
        }

        String mois = "janvier ";
        switch(mois) {
            case "janvier" :
            case "février" :
            case "mars" :
                System.out.println("Cest l'hiver");
                break;

        }

        char initial = 'c';

        switch (initial) {
            case 'c' :
                System.out.println("Cest christian");
                break;
            case 'v' :
                System.out.println("Cest vistoire");
                break;
        }

    }
}
