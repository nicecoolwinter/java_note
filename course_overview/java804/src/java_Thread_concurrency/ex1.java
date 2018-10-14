package java_Thread_concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class ex1
{

    public static void main(String[] args)
    {
        AtomicInteger[] var = new AtomicInteger[5];

        //System.out.println(var[0]);
        for (int i = 0; i < 5; i++) {
            var[i] = new AtomicInteger();
        }

        //var[0].incrementAndGet();
        //System.out.println(var[0]);
        for (int i = 0; i < var.length; i++) {
            var[i].incrementAndGet();

            if (i == 2) {
                var[i].compareAndSet(2, 4);
            }

            System.out.print(var[i] + " ");
        }

    }

}
/*
what is the result?

A)1 1 1 1 1
B)1 2 3 4 5
C)0 1 2 3 4
D)0 1 4 3 4





*/