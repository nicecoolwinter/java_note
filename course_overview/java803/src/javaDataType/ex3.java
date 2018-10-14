package javaDataType;

public class ex3
{

    public static void main(String[] args)
    {
        String p = "nature*beautiful";

        int vowel = 0;
        int num = 0;

        for (int idx = p.length() - 1, c = 7;
             idx > 0 && p.charAt(idx) != '*';
             idx--) {
            switch (p.charAt(idx)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                vowel = --c;
            }

            num = idx;

        }

        System.out.print(vowel + ", " + num);
    }

}

/*
 * what is the result?
 *
 * A)Compilation fails
 * B)0, 7
 * C)1, 6
 * D)2, 7
 * E)An IndexOutOfBoundsException is thrown at runtime
 */
