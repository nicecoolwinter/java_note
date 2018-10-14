package java_Interface;
interface Vehicle
{
    public void start();
    public void stop();
}
interface Motorized
{
    public void stop();
    public void slow();
}
class Car implements Vehicle, Motorized
{
    public void slow()
    {
        System.out.println("start");
    }
    public void start()
    {
        System.out.println("stop");
    }
    public void stop()
    {
        System.out.println("slow");
    }
}
public class ex7
{
    public static void main(String[] args)
    {
        Vehicle e = new Car();
        e.start();
        //e.slow();
        e.stop();

    }

}
/*
What is the result?
A)Start Slow stop
B)Start followed by a runtime exception
C)compilation fails at line 18
D)compilation fails at line 19
E)compilation fails at line 20
F)compilation fails at line 21


*/