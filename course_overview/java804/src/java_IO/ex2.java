package java_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex2
{


    public static void main(String[] args)
    {
        byte[] b = new byte[128];

        try {
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);
            int read;
            //while loop
            fos.write(b, 0, read);
        }
    } catch (IOException i) {}



}

}
/*
What statement should be inserted on line 16 to make this code function?

A)while (read=fis.read(b)){
B)while ((read=fis.read())!=0){
C)while ((read=fis.read())!=-1){
D)while ((read=fis.read())!=null){




*/