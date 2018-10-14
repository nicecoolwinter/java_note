/*
Given the greetings.properties file,containing;
HELLO_MSG=Hello,everyone!
GOODBYE_MSG=Goodbye everyone!


*/
package java_local;

import java.util.Locale;
import java.util.ResourceBundle;

public class ex2
{
    public void loadResourceBunndle()
    {
        ResourceBundle resource = ResourceBundle.getBundle("greetings", Locale.US);
        System.out.println(resource.getObject("HELLO_MSG"));
    }

    public static void main(String[] args)
    {
        new ex2().loadResourceBunndle();

    }



}
/*
what is the result?

A)Compilation fails
B)HELLO_MSG
C)GOODBYE_MSG
D)Hello, everyone;
E)Goodbye everyone!




*/