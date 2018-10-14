package java_Thread_concurrency;

public class ex3 extends Thread
{
    public void run()
    {
        System.out.print("1 ");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.print("e1 ");
        }

        System.out.print("2 ");
    }

    public static void main(String[] args)
    {
        Thread t1 = new ex3();
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("e2 ");
        }

        try {
            t1.interrupt();
        } catch (Exception e) {
            System.out.print("e3 ");
        }
    }

}
/*
what is the most likely result?

A)1 e3
B)1 e1 2
C)1 e3 2
D)1 e2 e1 2
E)Compilation fails





*/