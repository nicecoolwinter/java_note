package java_Method_Encapsulation;

public class ex7_static
{

    static double dvalue;
    static ex7_static ref;//java.lang.Object


    public static void main(String[] args)
    {
        System.out.println(ref);
        System.out.println(dvalue);

    }

}
/*
What is the result?

A)A NullPointerException is thrown at runtime
B)
null
0.0

C)
<the memory address referenced by ref>
0.00000

D)
java_Method_Encapsulation.ex7_static.class
0.0

E)Compilation fails






*/