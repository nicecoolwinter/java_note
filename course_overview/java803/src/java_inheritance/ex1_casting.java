package java_inheritance;
class Building {}
public class ex1_casting extends Building
{
    public static void main(String[] args)
    {
        Building build1 = new Building();
        ex1_casting barn1 = new ex1_casting();
        ex1_casting barn2 = (ex1_casting)build1;
        Object obj1 = (Object)build1;
        String str1 = (String)build1;
        Building build2 = (Building)barn1;



    }

}
/*
Which line of code results in a compilation error?

A)line 7
B)line 8
C)line 9
D)line 10


*/