public class Task7_94 {
    public static int exponent(int x1, int x2)
    {
        if (x2 > 1)
        {
            x1 = x1 * exponent(x1,x2-1);
        }
        return x1;
    }
    public static void main(String[] args)
    {
        System.out.println(exponent(5,3));
    }
}
