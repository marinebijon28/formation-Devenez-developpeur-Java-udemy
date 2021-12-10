public class LesOperateursDIncrementationEtDecrementation {
    public static void main(String... args)
    {
        // declaration and affectation
        int integerValue = 5;

        //increment
        integerValue = integerValue + 1;
        integerValue += 1;
        // post increment
        integerValue++;
        // pre increment
        ++integerValue;

        // decrement
        integerValue = integerValue - 1;
        integerValue -= 1;
        // post decrement
        integerValue--;
        // pre increment
        --integerValue;

        System.out.println(integerValue);
    }
}
