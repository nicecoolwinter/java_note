/* 由字元組成的文字符號稱為字串，例如"Hello"字串是由'H'、'e'、'l'、'l'、'o'五個字元組成，
 * 在某些程式語言中，字串是以字元陣列的方式存在，然而在Java中，字串是java.lang.String實例，
 * 用來包裹字元陣列，你可以用""包括一串字元來建立字串：
 */

public class StringTest {
    public static String toLowerCase(String str) {
        String resultStr = "";

        for (int i = 0 ; i < str.length() ; i++) {
            System.out.println(str.charAt(i) + " : " +  (int)(str.charAt(i)));
            if ((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90) {
                resultStr += (char)(str.charAt(i) + 32);
            } else {
                resultStr += str.charAt(i);
            }
        }

        // System.out.println(resultStr);
        return resultStr;
    }

    public static int length(String str) {
        int len = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            // do something
        }

        return len;
    }

    public static void main(String[] args) {
        /*
        String name = "justin";                    // 建立String實例
        System.out.println(name);                  // 顯示justin
        System.out.println(name.length());       // 顯示長度為6
        System.out.println(name.charAt(0));      // 顯示第一個字元j
        System.out.println(name.toUpperCase()); // 顯示JUSTIN
        */

        String test = "HEloo";
        System.out.println(toLowerCase(test));
        System.out.println(length(test));
    }    
}
