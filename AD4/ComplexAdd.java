public class ComplexAdd extends ComplexBase{
    private final double realA;
    private final double imaginaryA;

    public ComplexAdd() {
        this.realA = 0;
        this.imaginaryA = 0;
    }

    public ComplexAdd(double real1, double imaginary1, double real2, double imaginary2)
    {
        super(real1, imaginary1, real2, imaginary2);
        this.realA = super.getFirstReal() + super.getSecondReal();
        this.imaginaryA = super.getFirstImaginary() + super.getSecondImaginary();
    }

    public String toString()
    {
        return String.format("Complex Numbers Addition:        " +
                        "(%.1f, %.1f) + (%.1f, %.1f)  = (%.1f, %.1f)",
                super.getFirstReal(), super.getFirstImaginary(),
                super.getSecondReal(), super.getSecondImaginary(),
                realA, imaginaryA);
    }
}
