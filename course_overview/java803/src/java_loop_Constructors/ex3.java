package java_loop_Constructors;

public class ex3
{
    static boolean bVar;

    public static void main(String[] args)
    {
        boolean bVar1 = true;
        int count = 8;

        do {
            System.out.println("Hello java!" + count);

            if (count >= 7) {
                bVar1 = false;
            }

            count -= 2;

        } while (bVar != bVar1 && count > 4);

        System.out.println(bVar);

    }

}
/*
What is the result?

A)Compilation fails
B)
Hello java! 8
Hello java! 6

C)
Hello java! 8
Hello java! 6
Hello Java! 4

D)
Hello java! 8






*/