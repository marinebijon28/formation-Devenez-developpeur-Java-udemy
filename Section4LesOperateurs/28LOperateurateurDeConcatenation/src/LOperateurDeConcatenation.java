public class LOperateurDeConcatenation {
    public static void main(String... args){
        // declaration and affectation
        // concat two string and affect the value the variable str
        String str = "Voici une chaîne " + "concatenée";
        System.out.println(str);

        // concat two values' variable
        str = "Voici une chaîne ";
        String strEnd = "concatenée";
        System.out.println(str + strEnd);

        //age of type int is transformed into string for display
        str = "Mon age est ";
        int age = 43;
        System.out.println(str + age);
        // conflict between increment and concat it's concat win
        System.out.println(str + age + 1);
        // for increment use () for to be has first
        System.out.println(str + (age + 1));
    }
}
