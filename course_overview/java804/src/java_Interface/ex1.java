package java_Interface;
interface Quackable
{
    public void quack();
}

interface Waddlable
{
    public void waddle();
}

public class ex1
{

}

/*
Which compiles?

A)interface Duckable implements Quackable, Wadddlable{}
B)interface Duckable extends Quackable,extends waddlable{}
C)interface Duckable extends Quackable,Waddlable"{}
D)interface Duckable implements waddlable extends Quackable{
    public void waddle();
}

E)interface Duckable extends Quackable implements waddlable{
    public void waddle(){}
}



*/