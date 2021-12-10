public class IntroductionAuFormattageDeChaine {
    public static void main(String... args){
        // declaration and affectation
        String sentence = "Mon age est de ";
        int age = 43;
        System.out.println(sentence + age + " ans. Oui je fais plus jeune");
        // it's same
        // %s it's for type String %d it's for type decimal
        System.out.printf("%s%d ans. Oui je fais plus jeune", sentence, age);
    }
}
