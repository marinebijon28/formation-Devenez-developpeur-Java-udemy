// Car is class girl of class vehiculeAMoteur
public class Car extends VehiculeAMoteur{

    // surcharge function
    void tourner(String leftOrRight, int angle) {
        System.out.println("La voiture va tourner à " + leftOrRight + " d'un angle de : " + angle);
    }

    void tourner(boolean left, int angle){
        String leftOrRight = "left";

        if (left){
            leftOrRight = "right";
        }
        System.out.println("La voiture va tourner à " + leftOrRight + " d'un angle de : " + angle);
    }

    // polymorphisme
    Ville transporter(Passanger passager, Ville villeDepart) {
        System.out.println("La voiture transporte un passager qui s'appelle " + passager.prenom + " " + passager.nom);
        System.out.println("Le passager est parti de la ville de " + villeDepart.nom);

        Ville villeDestination = new Ville();
        villeDestination.nom = "Wellington";

        return villeDestination;
    }

}
