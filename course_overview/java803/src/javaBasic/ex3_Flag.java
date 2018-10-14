package javaBasic;

public class ex3_Flag
{

    boolean isFlagChanged;
    boolean flag;
    public boolean changeFlag(boolean flag)
    {
        if (flag) {
            flag = !flag;
        } else {
            flag = true;
            isFlagChanged = true;
        }

        return isFlagChanged;
    }
    public static void main(String[] args)
    {
        ex3_Flag t = new ex3_Flag();
        t.changeFlag(false);
        System.out.println(t.flag + "," + t.isFlagChanged);

    }

}
/*
 * what is the rsult?
 *
 * A)Compilation fails
 * B)true, false
 * C)false,true
 * D)true, true
 * E)false, false
 *
 */
