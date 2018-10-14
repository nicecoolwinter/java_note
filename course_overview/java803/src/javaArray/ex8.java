package javaArray;

import java.util.ArrayList;
import java.util.List;


public class ex8
{
    public static List data = new ArrayList();
    static List update(String[] strs)
    {
        for (String x : strs) {
            data.add(x);

        }

        return data;
    }


    public static void main(String[] args)
    {
        String[] d = {"a", "b", "c"};
        update(d);

        for (String s : d) {
            System.out.println(s + " ");
        }

    }

}
/*
 * Which code fragment, when insertd at//insert code here, enables the code to compile ?
 *
 * A)static void update(String[] strs)
 * B)static ArrayList update(String[] strs)
 * C)List updaye(String[] strs)
 * D)static List update(String[] strs)
 * E)ArrayList static update(String[] strs)
 *
 *
 */
