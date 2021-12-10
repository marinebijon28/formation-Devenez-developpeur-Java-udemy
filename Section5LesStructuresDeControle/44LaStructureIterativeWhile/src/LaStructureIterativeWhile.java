public class LaStructureIterativeWhile {
    public static void main(String... args){
        int nb = 0;
        while (nb < 3){
            System.out.println("Hello World !");
            ++nb;
        }

        boolean bool = true;
        while (bool){
            System.out.println("Hello World !");
            bool = false ;
        }

        // use do while if you need to do at least once the condition
        do {
            System.out.println("Hello World !");
            bool = true;
            // this condition has no stop condition
            break;
        } while (bool);
    }
}
