public class Car {

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

}
