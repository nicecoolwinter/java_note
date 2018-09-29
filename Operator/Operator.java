public class Operator {
    static void Logical() 
    {
        int number = 75;
        System.out.println(number > 70 && number < 80);
        System.out.println(number > 80 || number < 75);
        System.out.println(!(number > 80 || number < 75));
    }

    static void Comparison() 
    {
        System.out.printf("10 >  5 結果 %b%n", 10 > 5);
        System.out.printf("10 >= 5 結果 %b%n", 10 >= 5);
        System.out.printf("10 <  5 結果 %b%n", 10 < 5);
        System.out.printf("10 <= 5 結果 %b%n", 10 <= 5);
        System.out.printf("10 == 5 結果 %b%n", 10 == 5);
        System.out.printf("10 != 5 結果 %b%n", 10 != 5);
    }

    static void Bitwise() 
    {
        System.out.println("AND運算：");
        System.out.printf("0 AND 0 %5d%n", 0 & 1);
        System.out.printf("0 AND 1 %5d%n", 0 & 1);
        System.out.printf("1 AND 0 %5d%n", 1 & 0);
        System.out.printf("1 AND 1 %5d%n", 1 & 1);

        System.out.println("\nOR運算：");
        System.out.printf("0 OR 0 %6d%n", 0 | 0);
        System.out.printf("0 OR 1 %6d%n", 0 | 1);
        System.out.printf("1 OR 0 %6d%n", 1 | 0);
        System.out.printf("1 OR 1 %6d%n", 1 | 1);

        System.out.println("\nXOR運算：");
        System.out.printf("0 XOR 0 %5d%n", 0 ^ 0);
        System.out.printf("0 XOR 1 %5d%n", 0 ^ 1);
        System.out.printf("1 XOR 0 %5d%n", 1 ^ 0);
        System.out.printf("1 XOR 1 %5d%n", 1 ^ 1);
    } 

    public static void main(String[] args) {
        // 比較、條件運算
        Comparison();
        // 邏輯運算
        Logical();
        // 位元運算
        Bitwise();
    }    
}
