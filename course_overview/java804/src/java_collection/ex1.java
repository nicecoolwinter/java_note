package java_collection;

import java.util.ArrayList;
import java.util.List;

public class ex1
{

    public static void main(String[] args)
    {
        List<Integer> myList = new ArrayList<Integer>(3);
        new ex1().append(myList);

    }
    void append(List myList)
    {
        myList.add("2");
    }

}
/*
A)Compilation succeeds without warnings
B)Compilation succeeds with an "unchecked" or "unsafe" waring
C)Compilation succeeds with an "invalid diamond usage"
D)RuntimeException is thrown at line 15;





*/