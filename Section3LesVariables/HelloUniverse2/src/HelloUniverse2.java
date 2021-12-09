public class HelloUniverse2 {
    public static void main (String... args)
    {
        int numberPlanity = 8;
        String firstSentence = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        String secondSentence = "Il y a quelques années cependant, elles étaient au nombre de : ";

        System.out.println(firstSentence);
        System.out.println(numberPlanity);
        System.out.println(secondSentence);
        System.out.println(numberPlanity + 1);
    }
}
