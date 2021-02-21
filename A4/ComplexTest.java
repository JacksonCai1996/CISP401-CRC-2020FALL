public class ComplexTest {
    public static void main(String[] args)
    {
        Complex a = new Complex(9.5, 7.7);
        Complex b = new Complex(1.2, 3.1);

        System.out.println("\nA complex number in the\n" +
                "form (x, y) is equal to" +
                "\nx + yi, where i is\nsquare root of -1.\n");

        System.out.println("*-Complex numbers calculations-*");

        System.out.printf("a = %s%nb = %s%na + b = %s%na - b = %s%n" +
                        "a * b = %s%na / b = %s%n",
                a.toString(), b.toString(),
                a.Add(b).toString(), a.Subtract(b).toString(),
                a.Multiply(b).toString(), a.Division(b).toString());
    }
}
