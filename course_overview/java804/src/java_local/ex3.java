/*
 Given the content of the Messages.properties and Message_fr_FR.properties file:

 Messages.properties:
 greet=welcome!

 Messages_fr_FR.properties:
 greet=Bienvenue

 Given the code fragment:




 */
package java_local;

import java.util.Locale;
import java.util.ResourceBundle;

public class ex3
{

    public static void main(String[] args)
    {
        // line n1
        Locale locale = Locale.FRANCE;
        Locale.setDefault(locale);
        ResourceBundle resource = ResourceBundle.getBundle("Messages");
        System.out.print(resource.getString("greet"));

    }

}

/*
 which two code fragments, when inserted at Line n1 independently,enable the code print
 Bienvenue?

 A)Locale locale=new Locale("fr_FR");
 B)Locale locale=new Locale("FR");
 C)Locale locale=Locale.FRENCH;
 D)Locale locale=Locale.FRANCE;
 E)Locale locale=new Locale(Locale.FRENCH,Locale.FRANCE);



 */
