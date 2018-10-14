package java_Method_Encapsulation;

public class ex4_method
{
    int sum = 0;
    public void doCheck(int number)
    {
        if (number % 2 == 0) {
            //break;
        } else {
            for (int i = 0; i < number; i++) {
                sum += i;
            }
        }
    }

    public static void main(String[] args)
    {
        ex4_method obj = new ex4_method();
        System.out.println("Red " + obj.sum);
        obj.doCheck(2);
        System.out.println("Orange " + obj.sum);
        obj.doCheck(3);
        System.out.println(" Green " + obj.sum);

    }

}
/*
what is the result?

A)Compilation fails
B)
Red 0
Orange 0
Green 6

C)
Red 0
Orange 0
Green 3

D)
Red 0






*/