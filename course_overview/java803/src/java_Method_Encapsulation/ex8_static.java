package java_Method_Encapsulation;

public class ex8_static
{

    public static void main(String[] args)
    {
        ex8_static ts = new ex8_static();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();

        System.out.println(isAvailable);

    }

    public static boolean doStuff()
    {
        return !isAvailable;
    }

    static boolean isAvailable = false;

}
/*
A)false true
B)true true
C)true false
D)false false
E)Compilation fails



*/