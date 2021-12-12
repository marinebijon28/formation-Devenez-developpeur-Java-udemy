// Object is class mother of all class if not extends other class
public class VehiculeAMoteur extends Object {
    Moteur moteur;
    int vitesse;

    int accelerer(int vitesse){
        System.out.println("j'accèlere");
        this.vitesse = vitesse;
        return vitesse;
    }

    Ville transporter(Passanger passager, Ville villeDepart) {
        System.out.println("Le véhicule transporte un passager qui s'appelle " + passager.prenom + " " + passager.nom);
        System.out.println("Le passager est parti de la ville de " + villeDepart.nom);

        Ville villeDestination = new Ville();
        villeDestination.nom = "Wellington";

        return villeDestination;
    }
}
