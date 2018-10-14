package java_local;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ex6
{
    public static void main(String args[])
    {
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("MMMM", Locale.UK);
        System.out.println("result:" + sdf.format(new Date()));

    }

}
/*
Given the code format:

SimpleDateFormat sdf;

Which code statements will display the full text month name?

A)
sdf=new SimpleDateFormat("mm",Locale.UK);
System.out.println("result:"+sdf.format(new Date()));


B)
sdf=new SimpleDateFormat("MM",Locale.UK);
System.out.println("result:"+sdf.format(new Date()));


C)
sdf=new SimpleDateFormat("MMM",Locale.UK);
System.out.println("result:"+sdf.format(new Date()));

D)
sdf=new SimpleDateFormat("MMMMM",Locale.UK);
System.out.println("result:"+sdf.format(new Date()));




*/