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
    }
}
