package java_Exception;
class SpecialException extends Exception
{

    public SpecialException(String message)
    {
        super(message);
        System.out.println(message);
    }

}


public class ex4_exception
{

    public static void main(String[] args)
    {
        try {

            doSomething();

        } catch (SpecialException e) {
            System.out.println(e);
        }

    }


    static void doSomething() throws SpecialException {
        int[] ages = new int[4];
        ages[4] = 17;
        doSomethingElse();
    }
    static void doSomethingElse() throws SpecialException {
        throw new SpecialException("Thrown at end of doSomething() method");
    }

}

/*
 What will be the output?

 A)
 SpecialException: Thrown at end of doSommething() method
    at java_Exception.ex4_exception.doSomething(ex4_exception.java:34)
    at java_Exception.ex4_exception.main(ex4_exception.java:20)

 B)
 Error in thred "main" java.lang.ArrayIndexOutofBoundsError
 C)
 SpecialException:Thrown at end of doSomething() method

 D)
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
    at java_Exception.ex4_exception.doSomething(ex4_exception.java:34)
    at java_Exception.ex4_exception.main(ex4_exception.java:20)









 */
