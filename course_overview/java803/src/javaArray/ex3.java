package javaArray;

public class ex3
{

    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3};

        for (int var : arr) {
            int i = 1;

            while (i <= var);

            System.out.println(i++);

        }

    }

}
/*
What is the result?
A)
1
2
3

B)
1
1
1

C)Compilaton fails

D)The loop executes infinite times


*/