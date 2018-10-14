package java_inheritance;
class Mid
{
    public int findMid(int n1, int n2)
    {

        return (n1 + n2) / 2;

    }


}

public class ex5_poly extends Mid
{

    public static void main(String[] args)
    {
        int n1 = 22, n2 = 2;
        //insert code here

        //System.out.println(n3);

    }

}
/*
Which two code fragments,when insert at//insert code here, enable code to print 12?

A)int n3=ex5_poly.findMid(n1,n2);
B)
Mid m1=new ex5_poly();
int n3=`m1.finMid(n1,n2);

C)
ex5_poly c=new Mid();
int n3=c.findMid(n1,n2);

D)
ex5_poly c=new ex5_poly();
int n3=c.findMid(n1,n2);

E)
int n3=super.finMid(n1,n2);





*/