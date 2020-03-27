public class Assignment8 {
    public void exceptionHandling() throws Exception1,Exception2,Exception3
    {
        throw new Exception1();
    }

    public static void main(String args[])
    {
        Assignment8 errors = new Assignment8();
        try
        {
            errors.exceptionHandling();
        }
        catch(Exception1 | Exception2 | Exception3 e)
        {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("The code is executed successfully");
        }
    }

    class Exception1 extends Exception
    {

    }

    class Exception2 extends Exception
    {

    }

    class Exception3 extends Exception
    {

    }
}
