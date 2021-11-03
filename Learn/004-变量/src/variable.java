public class variable {
    public static void main(String[] args) {
        byte b = 100;
        short s = 200;
        int i = 500;
        long l = 1000;

        // 超过精度范围会报错
//        b = 200;
        // char 单引号，只能放一个字符
        char c = 'a';
//        char c1 = 'ab';
        // 小数默认是double类型，需+ f  转成float类型
        float f = 34.31f;

        // string类型
        String str = "hello world";

        // 练习
        float f1 = 3.14f;
        double d = 2.769343;
        int year = 365;
        short num = 12;
        char eat = '吃';
        boolean b1 = false;
        String str1 = "不可描述";

        // 字面值
        long val = 26L;
        int decVal = 24;
        int hexVal = 0x1a;
        int oxVal = 032;
        int binVal = 0b1010;
        System.out.println(oxVal);

        float f2 = 123.4f;
        double d2 = 123.4;
        double d3 = 1.234e2;


    }
}
