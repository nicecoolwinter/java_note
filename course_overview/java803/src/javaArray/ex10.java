package javaArray;

import java.util.ArrayList;
import java.util.List;

public class ex10
{

    public static void main(String[] args)
    {
        List e = new ArrayList();
        e.add("H");
        e.add(1, "N");
        e.add(1, "Li");
        e.add("B");
        e.set(2, "Au");

        System.out.println(e);
    }

}
/*
What is the result?

A)[H,Li,Au,B]
B)[H,Li,Au]
C)[H,Li,Au,N,B]
D)[H,N,Au,B]


*/