package java_Operator_Constructs;

public class ex8_X
{

    String str = "default";
    ex8_X(String s)
    {
        str = s;
    }

    void print()
    {
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        new ex8_X("hello").print();

    }

}
/*
what is the result?

A)hello
B)default
C)Compilation fails
D)The program prints nothing


*/