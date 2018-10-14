package java_loop_Constructors;

public class ex4_while
{

    public static void main(String[] args)
    {
        String s = "hello java";

        char space = ' ';

        int index = 0;
        int count = 0;


        while (index < s.length() - 1 || s.charAt(index) == space) {
            count++;
            index = count;
            System.out.println(s.length() - count);
        }

        System.out.println(s.length() - count);

    }

}

/*

What is the result?

A)An IndexOutofBoundsException
B)1
C)5
D)10







*/