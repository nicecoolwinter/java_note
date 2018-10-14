package java_Exception;
class DivideByZero extends ArithmeticException
{
    public DivideByZero()
    {
        super();
    }
    public DivideByZero(String reason)
    {
        super(reason);
    }
}

public class ex3
{

    public static void main(String[] args)
    {
        try {

            int r = 1 / 0;
        } catch (DivideByZero d) {
            System.out.println("Attempt to divide by zero");
        } catch (ArithmeticException d) {
            System.out.println("Other arithmetic exception:");
        }

    }

}
/*
what is the result?

A)Attempt to divide by zero
B)other aritmetic exception
C)compilation fails
D)No output is produced





*/