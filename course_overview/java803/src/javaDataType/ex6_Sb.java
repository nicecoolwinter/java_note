package javaDataType;

public class ex6_Sb
{


    public static void main(String[] args)
    {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = str1;
        System.out.println(str1 == str2);

    }

}
/*which code fragement, when insertd at line9,enabled the
 *code to print true?
 *
 *A)String str2="Duke";
 *B)String str2=sb1.toString();
 *C)String str2=new String(str1);
 *D)String str2=str1;
 *
 *
 */
