public class CISP401V11A5 {
    public static void main(String[] args)
    {
        try
        {
            CISP401Method();
        }
        catch (Exception exception)
        {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
        }
    }

    public static void CISP401Method() throws Exception
    {
        try
        {
            CISP401Method2();
        }
        catch (Exception exception) // catch the exception from CISP401Method2
        {
            throw exception; // rethrow the exception
        }
    }

    public static void CISP401Method2() throws Exception
    {
        throw new Exception("Exception thrown in CISP401Method2");
    }
}
