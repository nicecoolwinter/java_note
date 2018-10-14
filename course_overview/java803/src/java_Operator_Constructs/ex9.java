package java_Operator_Constructs;

public class ex9
{

    public static void main(String[] args)
    {
        try {
            args = null;
            args[0] = "test";
            System.out.println(args[0]);
        }

        catch (Exception ex) {
            System.out.println("Exception");
        } catch (NullPointerException npe) {
            System.out.println("NullPonterException");
        }

        /*
        catch(Exception ex)
        {

        }
        catch(NullPointerException npe)
        {

        }
         */
    }

}
/*
 * what is the result?
 *
 * A)Exception
 * B)test
 * C)NullpointerException
 * D)Compilation fails
 *
 *
 *
 */
