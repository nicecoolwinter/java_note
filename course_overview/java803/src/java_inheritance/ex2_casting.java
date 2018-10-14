package java_inheritance;
class x
{
    public void mx()
    {
        System.out.println("xm1");
    }
}
class Y extends x
{
    public void mx()
    {
        System.out.println("xm2");
    }
    public void mY()
    {
        System.out.println("Ym");
    }
}
public class ex2_casting
{

    public static void main(String[] args)
    {
        x xref = new Y();
        Y yref = (Y)xref;

        yref.mY();
        xref.mx();
        System.out.println(yref);
        System.out.println(xref);


    }

}
/*
A)
Ym
xm2

B)
Ym
xm

C)Compilation fails

D)classCastException is thrown at runtime



*/