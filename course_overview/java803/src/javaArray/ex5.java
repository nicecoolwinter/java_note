package javaArray;
class Dog
{

}
public class ex5
{

    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = d2;
        //do complex stuff
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


    }

}

/*
 * How many objects have been created when the line//do complex stuff is reache
 *
 * A)one
 * B)two
 * C)three
 * D)four
 *
 *
 * */
