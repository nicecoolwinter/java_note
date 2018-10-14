package java_inheritance;
interface pet
{
    void eat();
}

class Dog implements pet
{
    public void eat() {};
}
class Beagle extends Dog
{
    public void eat()
    {

    }
}

public class ex4_interface
{

}

/*
Which demonstrates the "program to an interface" principle?

A)
class petfood extends pet
{

    public void go(petfood d)
    {
        d.eat();
    }
}

B)
class petfood
{

    public void go(Beagle p)
    {

        p.eat();
    }

}

C)
class petfood
{

    public void go(pet p)
    {

        p.eat();
    }
}

D)
class petfood
{
    public void go(Dog d)
    {
        d.eat();

    }





*/