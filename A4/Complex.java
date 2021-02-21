public class Complex {
    private final double real;
    private final double imaginary;
    

    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex Add (Complex b)
    {
        return new Complex(this.real + b.real, this.imaginary + b.imaginary);
    }

    public Complex Subtract  (Complex b)
    {
        return new Complex(this.real - b.real, this.imaginary - b.imaginary);
    }

    public Complex Multiply   (Complex b)
    {
        return new Complex((this.real * b.real) - (this.imaginary * b.imaginary),
                (this.real * b.imaginary) + (this.imaginary * b.real));
    }

    public Complex Division   (Complex b)
    {
        double v = Math.pow(b.real, 2) + Math.pow(b.imaginary, 2);
        return new Complex(((this.real * b.real) + (this.imaginary * b.imaginary))/ v,

                ((this.imaginary * b.real) - (this.real * b.imaginary))/ v);
    }

    public String toString()
    {
        return String.format("(%.1f, %.1f)",real, imaginary);
    }
}
