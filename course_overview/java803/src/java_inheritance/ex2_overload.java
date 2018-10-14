package java_inheritance;

class A2
{
    int x;
    A2()
    {
        System.out.print(" A " + x);
    }
}

class B2 extends A2
{
    B2()
    {
        x++;
        super.x = this.x;
        System.out.print(" B " + x);
    }

    B2(int y)
    {
        this();
        this.x = y;
        System.out.print(" B2 " + x);
    }
}



public class ex2_overload
{

    public static void main(String[] args)
    {
        B2 bx = new B2(200);

    }

}
/*
what is the result
A)B2 200 B 201 A 200
B)A0 b1 B2 200
C)A200 B 201 B2200
D)B1 B2 201
E)B2 200 B 200
F)B2 200 B1 A0
*/
