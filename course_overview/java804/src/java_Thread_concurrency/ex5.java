package java_Thread_concurrency;
class Bolt implements Runnable
{

    @Override
    public void run()
    {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("exc ");
        }

        System.out.print(Thread.currentThread().getId() + " ");
    }

}

public class ex5
{

    public static void main(String[] args)
    {
        Bolt b = new Bolt();
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);

        try {
            t1.start();
            t2.start();
            t1.start();
        } catch (Exception e) {
            System.out.print("exc ");
        }

    }

}
/*
 * what is the result?
 *
 A)The output could be:8 9 8
 B)The output could be:8 9 4
 C)The output could be:exc 8 8
 D)The output could be:exc 8 9
 E)Compilation fails due to an error on line A
 F)Compilation fails due to an error on line B

 */
