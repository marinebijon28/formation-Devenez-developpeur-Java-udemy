import java.util.Arrays;

public class LaStructureConditionnelIf {
    public static void main(String... args){
        // declaration and affectation
        int age = 43;
        int ageOfCaptain = 38;
        System.out.printf("Mon age est %d ans.", age);
        // control structure if
        // if age superior at 30 it runs the instruction bloc content between the braces
        if (age > 30) {
            // \n is feed line the end line
            System.out.printf(" Oui je fais plus jeune.\n");
        }

        // if ageOfCapitain is inferior at age it runs the instruction bloc content between the braces
        if (ageOfCaptain < age)
        {
            System.out.printf("L'age du capitaine %d\n", age);
        }

        // if ageOfCapitain is superior at 20 and age inferior at 50
        // it runs the instruction bloc content between the braces
        if (ageOfCaptain > 20 && age < 50)
        {
            System.out.printf("L'age du capitaine %d\n", age);
        }
    }
}
