package java_collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ex2
{

    public static void main(String[] args)
    {
        Map<String, String> parList = new TreeMap<>();
        parList.put("p002", "Large widget");
        parList.put("p001", "Widget");
        parList.put("p002", "X-Large Widget");

        Set<String> keys = parList.keySet();

        for (String key : keys) {
            System.out.println(key + " " + parList.get(key));
        }

    }

}
/*
what is the result

A)
p001 widget
p002 X-Large widget

B)
p002 Larget widget
p001 widget

C)
p002 X-Large widget
p001 widget

D)
p001 widget
p002 Large widget



*/