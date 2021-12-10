public class HelloUniverse {
    public static void main(String... args){
        // declaration and affectation
        short date = 2006;
        int numberPlanet = 8;
        // if date superior or equal at 2006 the number
        if (date < 2006) {
            ++numberPlanet;
        }
        // display the sentence with values' variable
        System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d", date, numberPlanet);
    }
}
