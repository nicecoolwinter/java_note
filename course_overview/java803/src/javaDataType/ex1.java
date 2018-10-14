package javaDataType;
public class ex1
{

    public static void main(String[] args)
    {
        String str = "null";

        //System.out.println(str.length());
        if (str == null)

        {
            System.out.print("null");
        } else if (str.length() == 0) {
            System.out.print("zero");
        } else {
            System.out.print("some");
        }
    }

}

/*
what is the result?

A)null
B)zero
C)some
D)Compilation fails


*/