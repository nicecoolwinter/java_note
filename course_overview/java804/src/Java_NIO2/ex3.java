package Java_NIO2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ex3
{

    public static void main(String[] args)
    {
        Path path = Paths.get("\\sales\\guarter\\..\\qtr1report.txt");
        path.relativize(Paths.get("\\sales\\annualreport.txt"));

        //System.out.println(path);
        if (path.endsWith("annualreport.txt")) {
            System.out.print(true);
        } else {
            System.out.println(false);
        }

        System.out.println(path);
    }

}

/*
 what is the result?

 A)
 false
 \sales\quarter\..\qtr1reporter.txt

 B)
 false
 \quarter\..\qtr1reporter.txt

 C)
 true
 ..\..\..\annualreport.txt

 D)
 true
 \..\..\annualreporter.txt



 */
