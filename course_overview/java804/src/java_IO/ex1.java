package java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex1
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }
    public void readContent() throws IOException {
        String record = "";
        BufferedReader br = null;

        try(br = new BufferedReader(new FileReader("quarter1.txt")))
        {
            while ((record = br.readLine()) != null) {
                System.out.println(record);
            }



        }
    }
}
/*
What is the result?
A)Compilation fails due to an error on line 17
B)Compilation fails due to an error on line 19
C)The content of quarter1.txt is printed
D)An IOException

*/