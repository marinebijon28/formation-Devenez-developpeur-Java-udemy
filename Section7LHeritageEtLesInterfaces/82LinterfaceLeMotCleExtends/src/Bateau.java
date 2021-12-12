public class Bateau implements Amarable {
    int masse;

    @Override
    public int combienDeCorde(int vitesseDuVent) {
        return (masse / 10 + vitesseDuVent / 100);
    }
}
