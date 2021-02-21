public class ComplexSubtract extends ComplexBase{
    private final double realS;
    private final double imaginaryS;

    public ComplexSubtract () {
        this.realS = 0;
        this.imaginaryS = 0;
    }

    public ComplexSubtract (double real1, double imaginary1, double real2, double imaginary2)
    {
        super(real1, imaginary1, real2, imaginary2);
        this.realS = super.getFirstReal() - super.getSecondReal();
        this.imaginaryS = super.getFirstImaginary() - super.getSecondImaginary();
    }

    public String toString()
    {
        return String.format("Complex Numbers Subtraction:     " +
                        "(%.1f, %.1f) - (%.1f, %.1f)  = (%.1f, %.1f)",
                super.getFirstReal(), super.getFirstImaginary(),
                super.getSecondReal(), super.getSecondImaginary(),
                realS, imaginaryS);
    }
}
