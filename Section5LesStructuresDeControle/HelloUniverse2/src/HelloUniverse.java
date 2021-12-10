public class HelloUniverse {
    public static void main(String... args){
        short date = 1600;
        short numberPlanet = 0;

        if (date >= 1600 && date <= 2020) {
            if (date >= 1600 && date < 1700){
                numberPlanet = 7;
            }
            else if (date >= 1700 && date < 1800) {
                numberPlanet = 8;
            }
            else if (date >= 1800 && date < 2006) {
                numberPlanet = 9;
            }
            else {
                numberPlanet = 8;
            }
            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d\n", date, numberPlanet);
        }
        else{
            System.out.printf("Le programme ne peut pas fournir de résultat pour l'année %d\n", date);
        }

    }
}
