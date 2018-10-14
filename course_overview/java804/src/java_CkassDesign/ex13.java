package java_CkassDesign;
class Employee
{
    private Integer getSalary()
    {
        return 126;
    }
}
public class ex13 extends Employee
{
    public Byte getSalary()
    {
        return 127;
    }
}



/*
What is the result?

A)Compilation fails due to an error on line 5.
B)Compilation fails due to an error on line 9.
C)Compilation fails due to an error on line 11
D)Compilation succeeds


*/