package java_Method_Encapsulation;

public class ex1_encapslation extends Root
{

    public static void main(String[] args)
    {
        Root r = new ex1_encapslation();

        System.out.println(r.method1());//line n1
        System.out.println(r.method2());//line n2

    }

}

class Root
{
    private static final int max = 20000;
    int method1()
    {
        int a = 100 + max; //line n3
        return a;
    }

    protected int method2() //line n4
    {
        int a = 200 + max;
        return a;
    }
}
/*
Which line causes a compilation error?

A)line n2
B)line n1
C)line n3
D)line n4



*/