public class ComplexBase {
    private final double real1;
    private final double imaginary1;
    private final double real2;
    private final double imaginary2;

    public ComplexBase() {
        this.real1 = 0;
        this.imaginary1 = 0;
        this.real2 = 0;
        this.imaginary2 = 0;
    }

    public ComplexBase(double real1, double imaginary1, double real2, double imaginary2) {
        this.real1 = real1;
        this.imaginary1 = imaginary1;
        this.real2 = real2;
        this.imaginary2 = imaginary2;
    }

    public double getFirstReal() {
        return real1;
    }

    public double getFirstImaginary() {
        return imaginary1;
    }

    public double getSecondReal() {
        return real2;
    }

    public double getSecondImaginary() {
        return imaginary2;
    }
}
