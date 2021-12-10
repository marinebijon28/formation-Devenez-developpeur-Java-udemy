public class ElseIfImbricationDeBlocDInstruction {
    public static void main(String... args){
        // declaration and affectation
        int age = 45;
        System.out.printf("Mon age est %d ans.\n", age);

        // it's simple manner but the cyclomatic complexity
        if (age >= 30){
            System.out.println("Oui je fais plus jeune que mon age.");
        }
        // the cyclomatic complexity of two
        // 1
        else{
            // 2
            if (age < 10){
                System.out.println("Bravo à toi de commencer si jeune!");
            }
        }

        // it's good manner : it verify the first condition if enters a condition it does not check after
        if (age >= 30){
            System.out.println("Oui je fais plus jeune que mon age.");
        }
        else if (age < 10) {
            System.out.println("Bravo à toi de commencer si jeune!");
        }
        else if (age == 25) {
            System.out.println("25 ans vous devez être en pleine forme!");
        }
        else {
            System.out.println("Et je suis fier de mon age");
        }
    }
}
