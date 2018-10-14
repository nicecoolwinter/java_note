package java_Operator_Constructs;

public class ex1_Operator
{

    public static void main(String[] args)
    {
        int i = 10;
        int j = 20;
        int k = j += i / 5; //j=j+i/5;

        System.out.print(i + ":" + j + ":" + k);

    }

}
/*
what is the result?
A)10:30:6
B)10:22:6
C)10:22:20
D)10:22:22

*/