package javaBasic;

public class ex2_Access
{

    private int x = 0;
    private int y = 0;
    public static void main(String[] args)
    {
        ex2_Access accApp = new ex2_Access();
        accApp.printThis(1, 2);
        accApp.printThat(3, 4);

    }
    public void printThis(int x, int y)
    {
        x = x;
        y = y;
        System.out.println("x:" + this.x + " y:" + this.y);
    }
    public void printThat(int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("x:" + this.x + " y:" + this.y);
    }

}

/*what is the result?
 *
 * A)
 * z:1 y:2
 * x:3 y:4
 *
 * B)
 * x:0 y:0
 * x:3 t:4
 *
 * C)
 * x:1 y:2
 * x:0 y:0
 *
 * D)
 * x:0 y:0
 * x:1 y:1
 *
 *
 */
