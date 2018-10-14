package javaArray;

import java.util.ArrayList;
import java.util.List;

public class ex9
{

    public static void main(String[] args)
    {
        List colors = new ArrayList();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.remove(2);
        colors.add(3, "cyan");
        System.out.println(colors);

    }

}
/*
What is the result?

A)An IndexOutOfBoundsException is thrown at runtime
B)[green,red,cyan,yellow]
C)[green,blue,yellow,cyan]
D)[green,red,yellow,cyan]


*/