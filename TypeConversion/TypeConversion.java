// 轉型有失真問題

public class TypeConversion {
    public static void main(String[] args) {
        float F_PI = 3.14F;
        float cast_PI = (float)3.14;

        double D_PI = 3.14;

        short short_a = 1;
        short short_b = 2;
        short short_c = (short)(short_a + short_b); // possible loss of precision
        System.out.println(short_c);

        byte byte_a = 127;
        byte byte_b = 1;
        byte byte_c;

        byte_c = (byte)(byte_a + byte_b);
        System.out.println(byte_c);

        // 無法編譯必須轉型
        // byte_c = byte_a + byte_b;

        // 正確作法
        int int_c = byte_a + byte_b;
        System.out.println(int_c);

        // 中     小        小  
        int_c = byte_a + short_a;

        long long_a = 1;

        // 中         大          小 
        int_c = (int)(long_a + byte_b);
    }    
}
