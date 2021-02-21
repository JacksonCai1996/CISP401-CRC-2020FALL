public class ComplexDivision extends ComplexBase{
    private final double realD ;
    private final double imaginaryD;

    public ComplexDivision () {
        this.realD = 0;
        this.imaginaryD = 0;
    }

    public ComplexDivision (double real1, double imaginary1, double real2, double imaginary2)
    {
        super(real1, imaginary1, real2, imaginary2);
        this.realD = ((super.getFirstReal() * super.getSecondReal()) + (super.getFirstImaginary() * super.getSecondImaginary())) /
                (Math.pow(super.getSecondReal(),2) + Math.pow(super.getSecondImaginary(),2));

        this.imaginaryD = ((super.getFirstImaginary() * super.getSecondReal()) - (super.getFirstReal() * super.getSecondImaginary())) /
                (Math.pow(super.getSecondReal(),2) + Math.pow(super.getSecondImaginary(),2));
    }

    public String toString()
    {
        if(super.getSecondReal() == 0.0 && super.getSecondImaginary() == 0)
        {
            return String.format("Complex Numbers Division:        " +
                            "(%.1f, %.1f) / (%.1f, %.1f)  = %s",
                    super.getFirstReal(), super.getFirstImaginary(),
                    super.getSecondReal(), super.getSecondImaginary(),
                    "infinite.");
        }
        else
        {
            return String.format("Complex Numbers Division:        " +
                            "(%.1f, %.1f) / (%.1f, %.1f)  = (%.1f, %.1f)",
                    super.getFirstReal(), super.getFirstImaginary(),
                    super.getSecondReal(), super.getSecondImaginary(),
                    realD, imaginaryD);
        }
    }
}
