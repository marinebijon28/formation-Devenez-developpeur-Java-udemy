public class SurchargeDeMethode {
    public static void main(String... args){
        Car car = new Car();

        // surcharge function
        car.tourner("droite", 90);
        car.tourner(false, 90);
        Moteur moteur = new Moteur();
        moteur.essence = "Diesel";
        moteur.cylindre = 6;
        car.moteur = moteur;
        System.out.println(car.moteur.cylindre);

        Passanger passager = new Passanger();
        passager.prenom = "michel";
        passager.nom = "rey";
        Ville ville = new Ville();
        ville.nom = "houilles";
        car.transporter(passager, ville);

        VehiculeAMoteur vehicule = new VehiculeAMoteur();
        Passanger passager0 = new Passanger();
        passager0.prenom = "test";
        passager0.nom = "rey";
        Ville ville0 = new Ville();
        ville.nom = "houilles";
        vehicule.transporter(passager0, ville0);
    }
}
