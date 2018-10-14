package java_Exception;
class AgeOutofRangeException extends Exception
{

}

class CandiDate
{
    int age;
    CandiDate(int age) throws Exception {
        if (age <= 10 || age >= 15)
        {
            throw new AgeOutofRangeException();
        } else
        {
            this.age = age;
        }
    }

    public String toString()
    {
        return " Age: " + age;
    }
}

public class ex5_test
{

    public static void main(String[] args) throws Exception{
        CandiDate c = new CandiDate(20);
        CandiDate c2 = new CandiDate(32);
        System.out.println(c);
        System.out.println(c2);


    }

}

/*

Which change enables the code to print the following?

Age:20
Age:32

A)
encloseing line 31 to 34 within a try block and adding:
catch(AgeOutofRangeException e2){};

B)
replacing lin 30 with public static void main(String[] args) throws Exception

C)
replacing line 30 with public static void main(String[] args) throws
AgeOutofRangeException{

D)
enclosing line 31 to 34 with a try block and adding:
catch(Exception e1)
{

}
catch(AgeOutofException e2)
{

}






*/
