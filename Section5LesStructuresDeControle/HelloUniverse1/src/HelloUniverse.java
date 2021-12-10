public class HelloUniverse {
    public static void main(String... args){
        int numberPlanet = 0;
        int date = 2006;
        if (date < 2006){
            numberPlanet = 9;
        }
        else {
            numberPlanet = 8;
        }
        System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d\n", date, numberPlanet);
    }
}
