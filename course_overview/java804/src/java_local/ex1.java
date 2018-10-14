/*
/resources/Messages.properties
/resources/Messages_en.properties
/resources/Messages_FR.properties
 /codes/ex1.java

and given the content of the files:

Messages.properties:
msg=Good day!

Messages_en.properties:
msg=welcome

Messages_FR.properties:
msg=Bienvenue

and given the code fragement from the ex1.java

 */



package java_local;

import java.util.Locale;
import java.util.ResourceBundle;

public class ex1
{

    public static void main(String[] args)
    {
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("FR").build();
        //Locale locale=new Locale.Builder().build();
        Locale.setDefault(locale);
        ResourceBundle resource = ResourceBundle.getBundle("resources.Messages");
        System.out.print(resource.getString("msg"));

    }

}

/*

what is the result?

A)Bienvenue
B)welcome
C)Good day
D)A misstingResourceException is thrown at runtime

*/