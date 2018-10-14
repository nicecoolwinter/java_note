package javaDataType;

public class ex5_SB
{

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("tele");
        sb.append("vision");
        sb.insert(3, "_");
        System.out.println(sb);

    }

}
/*what is the result?
 *
 * A)television
 * B)tele-vision
 * C)tele
 * D)tel_evision
 * E)televis-ion
 * F)Compilation fails
 */
