package java_Interface;
interface Information
{
    void info();
}

interface Event extends Information
{
    void details();
}

abstract class Quiz implements Event
{
    abstract void profile();
    public void details()
    {
        System.out.print("Quiz");
    }
}

class PracticeQuiz extends Quiz
{
    void profile()
    {

    }

    public void detauls()
    {

    }
    public void info()
    {

    }
}
public class ex3
{

}
/*
which option, containing list of method(s), that must be implemented; in the class
PracticeQuiz, enable the code to compile?

A)info(), details(),and profile()
B)Only details() and profile()
C)Only info() and profile()
D)Only profile()






*/
