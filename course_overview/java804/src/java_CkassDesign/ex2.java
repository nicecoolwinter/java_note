package java_CkassDesign;
class A
{
    static int counter = 0;
    public void printCount()
    {
        System.out.print(counter + " ");
    }
}

class B extends A
{
    public int counter = 10;
    public void printCount()
    {
        System.out.print(counter + " ");
    }
}


public class ex2
{

    public static void main(String[] args)
    {
        A foo = new A();
        A bar = new B();
        foo.printCount();
        bar.printCount();

    }

}

/*
what is the result?

A)0 0
B)0 10
C)Compilation fails
D)An exception is thrown at runtime


*/