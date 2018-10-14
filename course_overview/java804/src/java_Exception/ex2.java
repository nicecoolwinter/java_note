package java_Exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class MyClass
{
    public void readFile(String file) throws IOException {
        InputStream in = new FileInputStream(file);
    }
}

public class ex2
{

    public static void main(String[] args)
    {
        MyClass mc = new MyClass();
        mc.readFile("userguide.txt");
        System.out.println("file: userguilde.txt opened");



    }

}
/*
What is the result, if the file userguide.txt exists?

A)An exception thrown at run time
B)Compilation fails due to and error on line 11
C)Compilation fails due to and error on line 19
D)file: userguide.txt opened





*/