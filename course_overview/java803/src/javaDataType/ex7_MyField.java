package javaDataType;

public class ex7_MyField
{

    int x;
    int y;
    public void doStuff(int x, int y)
    {
        this.x = x;
        y = this.y;
    }
    public void display()
    {
        System.out.print(x + " " + y + ":");
    }

    public static void main(String[] args)
    {
        ex7_MyField m1 = new ex7_MyField();
        m1.x = 100;
        m1.y = 200;
        ex7_MyField m2 = new ex7_MyField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();

    }

}
/*
 * what is the result?
 *
 * A)100 200:100 0
 * B)100 200:100 200
 * C)100 0:100 0
 *
 *
 *
 */
