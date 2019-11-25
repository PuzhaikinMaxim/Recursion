public class Task7_92 {
    public static int multiplication(int x1,int x2)
    {
        if (x2 > 1) {
            x1 = x1 + multiplication(x1, x2 - 1);
        }
            return x1;
    }
    public static void main(String[] args)
    {
        System.out.println(multiplication(5,5));
    }
}
