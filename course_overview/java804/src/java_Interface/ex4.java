package java_Interface;
interface Shape
{
    String category = "2D Graphics";
}

class Figure
{
    String category = "3D Graphics";
}

public class ex4 extends Figure implements Shape //line n1
{

    String category;
    ex4()
    {
        this.category = super.category;
    }
    public static void main(String[] args)
    {
        Shape obj = new ex4();      //line n2

        System.out.println(obj.category);

    }

}
/*
A)2D Graphics
B)3D Graphics
C)A compilation error occurs at line n1
D)A compilation error occurs at line n2

*/