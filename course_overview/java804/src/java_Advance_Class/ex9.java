package java_Advance_Class;

import java.util.concurrent.RecursiveTask;

public class ex9 extends RecursiveTask<Integer>
{
    final int low;
    final int high;
    static final int THERESHOLD =/*....*/;

    ex9(int low, int height)
    {
        this.low = low;
        this.high = height;
    }
    Integer computeDirectly() {/*.......*/};

    protected Integer compute()
    {
        if (high - low <= THERESHOLD) {
            return computeDirectly();
        }

        int mid = (low + high) / 2;
        ex9 s1 = new ex9(low, mid);
        ex9 s2 = new ex9(mid, high);
        invokeAll(s1, s2);

        return s1.compute() + s2.join();
    }


}
/*
which two changes make the program work correctly?

A)Results must be retrieved from the newly created Mytask instance and combined.
B)The THRESHOLD value must be increayed so that the overhead of task creation does not dominate
the cost of computation.

C)The midpoint computation must be altered so that it splits the workload in an optimal manner

D)The compute() method must be changed to return an Integer result

E)The computeDirectly() method must be enhanced to fork() newly created tasks

F)The Mytask class must be modified to extend RecursiveAction Instead of RecursiveTask












*/