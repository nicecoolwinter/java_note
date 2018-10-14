package java_CkassDesign;

public class ex14
{
    static String s = "";
    static void doIt(long x)
    {
        s += "L ";
    }
    static void doIt(Integer x)
    {
        s += "I ";
    }
    static void doIt(Object x)
    {
        s += "O ";
    }

    public static void main(String[] args)
    {
        int x = 1;
        //Integer[] ia= {1,2};
        Integer ia = 4;
        doIt(x);
        doIt(ia);
        System.out.println(s);

    }

}
/*
What is the result?
A)L O
B)L I
C)I O
D)I I
E)Compilation fails
F)An exception is thrown at runtime


*/