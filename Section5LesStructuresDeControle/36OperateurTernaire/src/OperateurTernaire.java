public class OperateurTernaire {
    public static void main(String... args){
        // declaration and affectation
        int age = 49;
        int ageOfCapitain = 25;
        System.out.println(ageOfCapitain > 20 && age < 50 ? "L'age du capitaine est de : " + ageOfCapitain :
                "Le code ne permet d'afficher l'age du capitain pour une raison farfelue");
    }
}
