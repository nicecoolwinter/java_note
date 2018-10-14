package java_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ex3
{
    static CopyOnWriteArraySet<String> arr = new CopyOnWriteArraySet<>();
    static void verify()
    {

        String var = "";
        Iterator<String> e = arr.iterator();

        while (e.hasNext()) {
            var = e.next();

            if (var.equals("A")) {
                arr.remove(var);
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("D");

        arr.addAll(list1);
        arr.addAll(list2);

        verify();

        for (String var : arr) {
            System.out.print(var + " ");
        }
    }

}
/*
A)null B D
B)null B null D
C)B D
D)D
E)An exception is thrown at runtime



*/