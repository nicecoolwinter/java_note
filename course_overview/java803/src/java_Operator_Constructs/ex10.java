package java_Operator_Constructs;

class A
{
    A()
    {
        System.out.println("hell A");
    }
}
public class ex10 extends A
{

    public static void main(String[] args)
    {
        new ex10();//super();

    }

}
/*

which statement is true about the default constructor of a top-level class?

A)The default constructor of a subclass always Invokes the no-argument constructor
of it's superclass

B)It has private access modifier in it's declaration

C)It can take arguments

D)It can be overload


*/