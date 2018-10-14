package java_Thread_concurrency;

public class ex2
{
    static int count = 0;

    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count++;
                }
            }
        }
                              );
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count--;
                }

            }

        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch (Exception e) {}

        System.out.println(count);
    }

}

/*
which statements is true ?

A)The result of count must always be 0.
B)The result of count must always be>0
C)The result of count must always be<0
D)The result of count is non-deteministic
E)concurrentAccessexception is thrown at runtime
F)InterrupttionException is thrown at runtime





*/