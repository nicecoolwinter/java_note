package java_CkassDesign;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex6
{

    public static void main(String[] args)
    {
        String str = "Long ago, in a galaxy far far away.";

        Pattern pattern = Pattern.compile("ag.*far");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.print(matcher.group());
        }

    }

}
/*
What is the result?

A)Long ago , in a galaxy far far away
B)Long ago, in a galaxy far far
C)ago, in a galaxy far
D)ago, in a galaxy far far
E)Compilation fails


*/