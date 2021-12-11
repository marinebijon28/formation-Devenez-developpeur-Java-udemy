public class SurchargeDeMethode {
    public static void main(String... args){
        Car car = new Car();

        // surcharge function
        car.tourner("droite", 90);
        car.tourner(false, 90);
    }
}
