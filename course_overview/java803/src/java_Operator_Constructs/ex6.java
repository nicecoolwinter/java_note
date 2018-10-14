package java_Operator_Constructs;

public class ex6
{

    public static void main(String[] args)
    {
        String title = "DR";

        //String msg="welcome";
        switch (title) {
            String msg = "welcome";

        case "AD":
            msg += " advance";
            break;

        case "DR":
            msg += " Doctor";
            break;

        case "Er":
            msg += " Engineer";
            break;

        default:
            msg = " guest";


        }

        System.out.println(msg);

    }

}
/*
 * what is the result?
 *
 * A)Compilation fails due to errors on line 8 and line 9
 * B)Compilation fails due only to an error on line 9
 * C)Compilation fails due only to an error on line 8
 * D)welcome Doctor Guest
 * E)Welcome Doctor Engineer
 * F)Welcome Doctor
 *
 *
 *
 *
 *
 *
 *
 */
