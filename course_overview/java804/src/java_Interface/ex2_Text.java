package java_Interface;

public class ex2_Text
{
    public static void display(long ivar)
    {
        System.out.println(ivar);
    }

    public static void display(Integer ivar)
    {
        System.out.println(ivar * ivar);
    }

    public static void display(Long ivar)
    {
        System.out.println(ivar * ivar * ivar);
    }

    public static void main(String[] args)
    {
        int var = 2;

        new ex2_Text().display(var);

    }

}
/*
what is the result?

A)2
B)4
C)8
D)Compilation fails




*/