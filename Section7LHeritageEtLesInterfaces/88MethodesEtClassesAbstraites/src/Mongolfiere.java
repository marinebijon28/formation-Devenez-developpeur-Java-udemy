public class Mongolfiere implements Amarable{
    int surface;

    @Override
    public int combienDeCorde(int vitesseDuVent) {
        return (surface / 50 + vitesseDuVent / 100);
    }
}
