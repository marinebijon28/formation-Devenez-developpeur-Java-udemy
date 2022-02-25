public class HelloUniverse1 {
    /**
     * main of project, it's run the project
     * @param args arguments of program
     */
    public static void main (String... args)
    {
        // declaration and affectation
        int numberPlanity = 8;
        String firstSentence = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        String secondSentence = "Il y a quelques années cependant, elles étaient au nombre de : ";

        // display the values' variables
        System.out.println(firstSentence);
        System.out.println(numberPlanity);
        System.out.println(secondSentence);
        System.out.println(numberPlanity + 1);
    }
}
