package java_Thread_concurrency;

public class ex6
{

}
/*
A programmer wants to create a worker class whose constructor takes an object tha
t implements the java.lang.Runnable interface.

Which definition of the Worker class is connect?

A)
public class worker<T implements Runnable>{
    worker(T r){
        Thread t=new Thread(r);
        }
B)
public class Worker<T extends Runnable>
{
    worker(T r)
    {

        Thead t=new Thread(r);
    }

}

C)
public class worker<Runnable super ?>
{

    worker(T r)
    {

        Thread t=new Thread(r);
    }

}


D)
public class worker<? super Runnable>
{
    worker(T r)
    {

        Thread t=new Thread(r);
    }

}

E)
public class worker<Runnable>
{
    worker(T r)
    {
        Thread t=new Thread(r);

    }



}







*/