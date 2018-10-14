package java_Operator_Constructs;

class Hello
{
    String title;
    int value;
    Hello()
    {
        title += "world";
    }
    public Hello(int value)
    {
        //this();
        this.value = value;
        title = "hello";
        Hello();
        //this();
    }
}

public class ex11
{

    public static void main(String[] args)
    {
        Hello c = new Hello(5);
        System.out.println(c.title);

    }

}
/*
 *
 * what is the result?
 *
 * A)Hello
 * B)Hello world
 * C)Compilation fails
 * D)worldHello
 *
 *
 *
 *
 */
