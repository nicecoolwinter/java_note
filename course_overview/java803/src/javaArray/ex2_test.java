package javaArray;
public class ex2_test
{
    static String[][] arr = new String[3][];
    private static void doPrint()
    {
        /*for(int i=0;i<arr.length-1;i++)
        {
            int j=arr[i].length-1;
            System.out.print(arr[i][j]);
        }
        */

        /*int i=0;
          for(String[] sub:arr)
          {
            int j=sub.length;
            System.out.print(arr[i][j]);
            i++;

          }
        */

        /*int i=0;
          for(String[] Sub:arr)
          {
            int j=Sub.length-1;
            for(String str:Sub)
            {
                System.out.println(str);
                i++;
            }

         }*/



        for (int i = 0; i < arr.length; i++) {
            int j = arr[i].length - 1;
            System.out.println(arr[i][j]);


        }


    }


    public static void main(String[] args)
    {
        String[] class1 = {"A", "B", "C"};
        String[] class2 = {"L", "M", "N", "O"};
        String[] class3 = {"I", "j"};
        arr[0] = class1;
        arr[1] = class2;
        arr[2] = class3;
        ex2_test.doPrint();

    }

}
/*Which code fragement, when inserted at line 4,enables the code
 *
 * A)
 * for(int i=0;i<arr.length;i++)
 * {
 *  int j=arr[i].length-1;
 *  System.out.print(arr[i][j]);
 * }
 *
 * B)
 * int i=0;
 * for(String[] sub:arr[][])
 * {
 *  int j=sub.length;
 *  System.out.print(arr[i][j]);
 *  i++;
 *
 * }
 *
 * C)
 * int i=0;
 * for(String[] Sub:arr)
 * {
 *  int j=sub.length-1;
 *  for(String str:sub)
 *  {
 *      System.out.println(str[j]);
 *      i++;
 *  }
 *
 * }
 *
 * D)
 * for(int i=0;i<arr.length;i++)
 * {
 *      int j=arr[i].length-;
 *      System.out.println(arr[i][j]);
 *
 *
 *  }
 *
 *
 *
 *
 *
 *
 */
