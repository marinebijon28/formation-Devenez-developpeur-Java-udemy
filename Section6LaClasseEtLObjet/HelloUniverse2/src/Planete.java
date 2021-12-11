public class Planete {
    // property / attribute / instantiate variable
    String nom;
    String matiere;
    long diametre;

    // methods
    String revolution(){
        return "Je suis la planète " + nom + " et je tourne autour de mon étoile.";
    }

    String rotation(){
        return "Je suis la planète " + nom + " et je tourne sur moi même.";
    }
}
