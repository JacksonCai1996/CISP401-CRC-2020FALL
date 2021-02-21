public class ComplexMathTest {
    public static void main(String[] args)
    {
        ComplexBase[] complex =
                {
                        new ComplexAdd(9.5, 7.7, 1.2, 3.1),
                        new ComplexSubtract (9.5, 7.7, 1.2, 3.1),
                        new ComplexMultiply(9.5, 7.7, 1.2, 3.1),
                        new ComplexDivision (9.5, 7.7, 1.2, 3.1),
                        new ComplexAdd(-6.3, 5.2, 3.4, -2.8),
                        new ComplexSubtract (-6.3, 5.2, 3.4, -2.8),
                        new ComplexMultiply(-6.3, 5.2, 3.4, -2.8),
                        new ComplexDivision (-6.3, 5.2, 3.4, -2.8),
                        new ComplexDivision (-6.3, 5.2, 0.0, 0.0),
                        new ComplexAdd(),
                        new ComplexSubtract (),
                        new ComplexMultiply(),
                        new ComplexDivision (),
                        new ComplexDivision (0,0,0,0.1),
                };

        System.out.println("\nA complex number in the form (x, y) is " +
                "equal to x + yi, where i is square\n" + "root of -1.\n");
        System.out.println("~~~~~~~********--------Complex numbers calculations--------********~~~~~~~");

        for(ComplexBase currentComplex: complex)
            System.out.println(currentComplex);
    }
}
