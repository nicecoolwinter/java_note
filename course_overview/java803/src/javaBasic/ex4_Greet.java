// package javaBasic;
import hand.dandy.keystroke;

public class ex4_Greet
{
    public static void main(String[] args)
    {
        String greeting = "Hello";
        System.out.print(greeting);
        keystroke stroke = new keystroke();
        stroke.typeExclamation();
    }

}
/*package hand.dandy;
 * public Class keystroke{
 *  public void typeExclamation()
 *  {
 *      System.out.println("|");
 *  }
 *
 */

/*What three modifications,made independently,enable
 *enable the code compile and run?
 *
 *A) import handy.dandy.Keystroke.typeexclamation();
 *   added before line 1
 *
 *B) import hand.dandy.Keystroke;
 *   added after line 1
 *
 *C) import hand.dandy.*;
 *   added after line 1
 *
 *D) line 6 replaced with
 *   hand.dandy.Keystroke stroke=new handy.dandy.Ketstroke();
 *
 *E) line 6 replaced with
 *   handy.*.Keystroke stroke=new keystroke();
 *
 *F) line 6 replaced with
 *   handy.dandy.Keystroke stroke=new Keystroke();
 *
 *G) import handy.*;
 *   added before line 1
 *
 */
