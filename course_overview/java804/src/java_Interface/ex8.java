package java_Interface;

public class ex8
{
    private int strict = 1;

    class Harder extends ex8
    {
        private int strict = 2;
        public void go()
        {
            System.out.print(strict);
            System.out.print(ex8.this.strict);
            System.out.print(super.strict);
        }
    }

    public static void main(String rags[])
    {
        new ex8().new Harder().go();
    }

}
/*
A)112
B)221
C)211
D)RuntimeException is thrown at line 8
E)RuntimeException is thrown at line 9


*/