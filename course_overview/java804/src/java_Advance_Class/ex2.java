package java_Advance_Class;

public class ex2
{

    public static void main(String[] args)
    {
        Integer int1 = 1;
        Double double1 = new Double("1.1");
        Number int2 = 1;
        Number double2 = 0;

        System.out.println(int1 + double1);

    }

}
/*
What is the result?

A)Compilation fails
B)An exception is thrown at runtime
C)output is similar to:java.lang.Integer@187aea  java.lang.Double@187aeca
D)Output is:11.1
E)output is:2.1


*/