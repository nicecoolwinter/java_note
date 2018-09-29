/*
 * 對基本型態來說，想要宣告何種型態的變數，就使用byte、short、int、long、float、double、char、boolean等關鍵字來宣告，
 * 變數在命名時有一些規則，它不可以使用數字作為開頭，也不可以使用一些特殊字元，
 * 像是*、&、^、%之類的字元，而變數名稱不可以與Java 的關鍵字（Keyword）同名，
 * 例如int、float、class等就不能用來作為變數，變數名稱也不可以與Java保留字（Reversed word）同名，
 * 例如goto就不能用來作為變數名稱。
 *
 * 駝峰式（Camel case）
 */

public class Variable {
    public static void main(String[] args) {
        int number = 10;
        double PI = 3.14;
        System.out.println(number);
        System.out.println(PI);
    }    
}
