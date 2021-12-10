public class LesOperateursLogiques {
    public static void main(String... args)
    {
        // declaration and affectation
        boolean bool1 = true;
        boolean bool2 = true;

        // condition AND
        boolean result = bool1&bool2;
        // It's same manner more efficient
        result = bool1&&bool2;
        System.out.println(result);

        // condition OR
        result = bool1|bool2;
        // It's same manner more efficient
        result = bool1||bool2;
        System.out.println(result);

        // condition XOR
        // the condition should be one variable equal true not two false or two true
        result = bool1^bool2;
        System.out.println(result);

        // the condition NOT
        // the condition expected bool1 false and bool2 true
        result = !bool1&bool2;
        System.out.println(result);
    }
}
