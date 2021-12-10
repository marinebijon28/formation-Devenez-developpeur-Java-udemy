public class HelloUniverse {
    public static void main(String... args)
    {
        // declaration and affectation
        String sentence = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        int numberPlanet = 8;
        System.out.println(sentence + numberPlanet);
        sentence = "Il y a quelques années cependant, elles étaient au nombre de : ";
        // pre increment for display the number 9 in the concat
        System.out.println(sentence + ++numberPlanet);
    }
}
