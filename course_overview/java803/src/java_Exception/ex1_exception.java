package java_Exception;

public class ex1_exception
{
    static void disResult(int[] num)
    {
        try {

            System.out.println(num[1] / (num[1] - num[2]));
        } catch (ArithmeticException e) {
            System.out.println("first exception");
        }

        System.out.println("Done");
    }

    public static void main(String[] args)
    {
        try {
            int[] arr = {100, 100};

            disResult(arr);


        } catch (IllegalArgumentException e) {
            System.out.println("second Exception");
        } catch (Exception e) {
            System.out.println("third exception");
        }

    }

}

/*
 what is the result?

 A)
 0
 Done

 B)
 first exception
 Done

 C)
 second exception

 D)
 third exception



 */
