public class LaStructureConditionelleIfElse {
    public static void main(String... args){
        // declaration and affectation
        int age = 50;
        System.out.printf("Mon age est %d ans.\n", age);
        if (age >= 30){
            System.out.println("Oui je fais plus jeune.");
        }

        // declaration and affectation
        int ageOfCapitain = 25;

        // it's difficult manner
        if (ageOfCapitain > 20 && age < 50){
            System.out.println("L'age du capitaine est " + ageOfCapitain);
        }
        if (ageOfCapitain <= 20 && age >= 50){
            System.out.println("Le code ne permet pas d'être farfelue.");
        }

        // it's the simple manner
        if (ageOfCapitain > 20 && age < 50){
            System.out.println("L'age du capitaine est " + ageOfCapitain);
        }
        // if it does not fit into the first condition it fits into the first one
        // it's default
        else {
            System.out.println("Le code ne permet pas d'être farfelue.");
        }
    }
}
