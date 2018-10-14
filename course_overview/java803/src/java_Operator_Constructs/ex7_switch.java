package java_Operator_Constructs;

public class ex7_switch
{

    public static void main(String[] args)
    {
        //int day=1;
        String day = "1";

        switch (day) {
        case "7":
            System.out.println("Uranus");
            break;

        case "6":
            System.out.println("Saturn");
            break;

        case "1":
            System.out.println("Mercurys");
            break;

        case "2":
            System.out.println("Venus");
            break;

        case "3":
            System.out.println("Earth");
            break;

        case "4":
            System.out.println("Mars");
            break;

        case "5":
            System.out.println("Jupiters");
            break;

        }
    }
}
/*
 * which two modifications,made independently, enable the code to compile and run
 *
 * A)arranging the case label in ascending order
 * B)changing the String literals in each case label to Integer
 * C)adding a break statement after each print Statement
 * D)adding a default section within the switch code-block
 * E)changing the type and value of the day variable to string*
 *
 *
 *
 */
