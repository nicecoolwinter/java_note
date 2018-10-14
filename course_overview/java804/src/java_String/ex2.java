package java_String;

public class ex2
{

    public static void main(String[] args)
    {
        String s = "%2$s %s %3$b";
        String[] var = {"2", "1", "false"};
        //Object[] var= {"2","1",false};

        System.out.print(String.format(s, var));

    }

}
/*
what is the result?

A)1 1 false
B)1 2 false
C)2 1 false
D)1 1 true
E)1 2 true
F)2 1 true

*/