package java_Thread_concurrency;

public class ex8 extends Thread
{


    public static void main(String[] args)
    {
        Thread n1 = new ex8();
        Thread n2 = new ex8();
        n2.start();
        n1.start();

    }

    void run()
    {
        System.out.print(Thread.currentThread().getName() + " ");
        System.out.print(Thread.currentThread().getName() + " ");
    }

}
/*
which is true?

A)compilation fails
B)The code runs without output.
C)The output could be :Thread-7 Thread-7 Thread-7 Thread-7
D)The output could be :Thread-4 Thread-7 Thread-7 Thread-4
E)The output could be :Thread-4 Thread-7 Thread-7 Thread-3


*/