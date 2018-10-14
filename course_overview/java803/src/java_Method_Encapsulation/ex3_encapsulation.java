package java_Method_Encapsulation;
class Bass
{
    //insert code here
}

public class ex3_encapsulation extends Bass
{

    public static void main(String[] args)
    {
        /*ex3_encapsulation obj=new ex3_encapsulation();
        obj.setNum(3);
        System.out.println("Square="+obj.getNum()*obj.getNum());*/


    }

}
/*
Which two options, when inserted independently inside class Bass,ensure that
the class is being properly encapsulated and allow the program to execute and
print the square of the number?

A)
public int num;

private int getNum()
{
    return num;
}

public void setNum(int num)
{

    this.num=num;
}

B)
protected int num;
public int getNum()
{
return num;
}

public void setNum(int num)
{
    return num;
}

C)
private int num;
public int getNum()
{
    return num;
}

private void setNum(int num)
{
    this.num=num;
}

D)
public int num;
protected int getNum()
{
    return num;
}
protected void setNum(int num)
{

    num=num;
}


E)
private int num;
public int getNum()
{
    return num;
}
public void setNum(int num)
{

    num=num;
}


*/