package java_Exception;

public class ex3_exception
{

    public static void main(String[] args)
    {
        int ax = 10, az = 30;
        int aw = 1, ay = 1;

        try {

            aw = ax % 2;


            ay = az / aw;

        } catch (ArithmeticException e1) {
            System.out.println("invalid Divisor");
        } catch (Exception e2) {
            aw = 1;
            System.out.println("Divisor changed");
        }

        ay = az / aw;
        System.out.println("successful divisor" + ay);


    }

}
/*
 what is the result?

 A)
Invalid Divisor
Divisor Changed
Successful Division 30
B)
Invalid Divisor
Successful Division 30

C)
Invalid Divisor
Exception in thread "main" java.lang.ArithmeticException:/by zero
at java_Exception.ex3_exception.main(ex3_exception.java:28)

D)
Invalid Divisor













*/