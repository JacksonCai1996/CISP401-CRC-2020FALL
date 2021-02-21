public class ComplexMultiply extends ComplexBase{
    private final double realM ;
    private final double imaginaryM;

    public ComplexMultiply() {
        this.realM = 0;
        this.imaginaryM = 0;
    }

    public ComplexMultiply(double real1, double imaginary1, double real2, double imaginary2)
    {
        super(real1, imaginary1, real2, imaginary2);
        this.realM = (super.getFirstReal() * super.getSecondReal()) - (super.getFirstImaginary() * super.getSecondImaginary());
        this.imaginaryM = (super.getFirstReal() * super.getSecondImaginary()) + (super.getFirstImaginary() * super.getSecondReal());
    }

    public String toString()
    {
        return String.format("Complex Numbers Multiplication:  " +
                        "(%.1f, %.1f) * (%.1f, %.1f)  = (%.1f, %.1f)",
                super.getFirstReal(), super.getFirstImaginary(),
                super.getSecondReal(), super.getSecondImaginary(),
                realM, imaginaryM);
    }
}
