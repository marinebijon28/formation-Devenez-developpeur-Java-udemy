public class LesMotsClesBreakAndContinueDansLesStructuresIteratives {
    public static void main(String... args){
        boolean bool = true;
        int nb = 0;

        while (bool) {
            System.out.println("Hello World");
            ++nb;
            // if nb == 5 he stops and does not execute other instructions. It starts at the start of the loop
            if (nb == 5) {
                continue ;
            }
            System.out.println("NB ne vaut pas 5");
            // if nb == 10 he comes out of the loop
            if (nb == 10) {
                break;
            }
        }
    }
}
