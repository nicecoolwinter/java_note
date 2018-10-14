package Java_NIO2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex1
{
    static String displayDetails(String path, int location)
    {
        Path p = new File(path).toPath();
        String name = p.getName(location).toString();
        return name;
    }

    public static void main(String[] args)
    {
        String path = "project/doc/index.html";
        String result = displayDetails(path, 2);
        System.out.print(result);






    }

}
/*
what is the result?

A)doc
B)index.html
C)An IllegalArgumentException is thrown at runtime
D)An InvalidPathException is thrown at runtime
E)Compilation fails


*/