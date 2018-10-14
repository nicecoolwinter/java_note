package java_Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex6
{
    public static void displayDetails()
    {
        try(BufferedReader br = new BufferedReader(new FileReader("salesreport.dat"))) {
            String record;

            while ((record = br.readLine()) != null) {
                System.out.println(record);
            }

            //br.close();
            br = new BufferedReader(new FileReader("annualreport.dat"));

            while ((record = br.readLine()) != null) {
                System.out.println(record);
            }

        } catch (IOException e) {
            System.err.print(e.getClass());
        }
    }

}
/*
What is the result, if the file salesreport.dat does not exist?

A)Compilation falls only at line 10
B)Compilation falls only at line 17
C)Compilation fails at line 10 and 17
D)class java.io.IOException
E)class java.io.FileNotFoundException




*/