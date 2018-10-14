package javaDataType;

import java.util.ArrayList;
import java.util.List;

public class ex4_Ref
{

    public static void main(String[] args)
    {
        StringBuilder s1 = new StringBuilder("Hello");
        String s2 = s1.toString();

        List<String> lst = new ArrayList<String>();
        lst.add(s2);
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(lst.getClass());


    }

}
/*
what is the result?

A)
class java.lang.StringBuilder
class java.lang.String
class java.util.ArrayList

B)
class java.lang.String
class java.lang.String
class java.util.ArrayList

C)
class java.lang.Object
class java.lang.Object
class java.util.Collection

D)
class java.lang.StringBuilder
class java.lang.String
class java.util.List



*/