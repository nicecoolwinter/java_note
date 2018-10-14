package java_Operator_Constructs;

public class ex4
{
    public static void main(String[] args)
    {
        int x = 5;
        ex4 p = new ex4();
        p.doStuff(x);
        System.out.print(" main x=" + x);
    }

    void doStuff(int x)
    {
        System.out.print("doStuff x=" + x++);
    }

}
/*
A)Compilation fails
B)doStuff x=6 main x=6
C)doStuff x=5 main x=5
D)doStuff x=5 main x=6

*/
