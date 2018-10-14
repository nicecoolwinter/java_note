package java_Exception;

public class ex4
{
    static int inum = 10;
    public static boolean verify()
    {
        if (inum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void increment()
    {
        System.out.print((inum++) + ", ");
        assert verify();
    }
    public static void decrement()
    {
        System.out.print((--inum) + ", ");
        assert verify();
    }

    public static void main(String[] args)
    {
        increment();
        decrement();

    }

}
/*
And the command

java -ea Test

what is the result?

A)prints 9 and throws an assertion error
B)prints 10 and throws an assertion error
C)prints 9, 9  and throws an assertion error
D)prints 10, 9 and throws an assertion error




*/