package java_Advance_Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1
{

    public static void main(String[] args)
    {
        String str = "<h1>This is a header</h1>";

        Pattern pattern = Pattern.compile("h1");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            str = matcher.replaceFirst("h2");
            str = matcher.replaceFirst("h2");
            System.out.println(str);
        }

    }

}
/*
What is the result?

A)<h1>This is a header</h1>
B)<h1>This is a header</h2>
C)<h2>This is a header</h1>
D)<h2>This is a header</h1>
E)Compilation fails



*/