package javaArray;

public class ex1
{

    public static void main(String[][] args)
    {
        System.out.println("hello " + args[0][1]);
    }

    public static void main(String[] args)
    {
        ex1 obj = new ex1();
        String arr[][] = {args};

        obj.main(arr);

    }

}
/*
javac ex1,java
java ex1 Jude Joel John

what is result?

A)The program goes into an infinite loop with no output.
B)Hello Joel
C)Hello Jude
D)Hello John





*/