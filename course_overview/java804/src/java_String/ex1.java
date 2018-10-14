package java_String;

public class ex1
{

    public static void main(String[] args)
    {
        String title = "java 7, java 6";
        System.out.print(title.indexOf("java") + " ");
        title.replace("java", "jawa");
        System.out.print(title.indexOf("java"));



    }

}
/*
what is the result?

A)0 0
B)1 1
C)0 8
D)1 9
E)0 1




*/