package 操作符;

public class 逻辑运算符 {
    public static void main(String[] args) {
        // 长路与 &  和   短路与  &&
        // 长路 &  两边都会运算，短路 && 左边为假，则右边不会运算
        int i = 2;
        System.out.println(i == 1 & i++ == 2);
        System.out.println(i);

        int j = 2;
        System.out.println(j == 1 && j++ == 2);
        System.out.println(j);

        // 长路或与短路或类似
        int a = 2;
        System.out.println(a == 1 | a++ == 2);
        System.out.println(a);

        int b = 2;
        System.out.println(b == 2 || b++ == 2);
        System.out.println(b);

        // 取反 ！和异或 ^
        int m = 1;
        boolean bool = !(m++ == 3) ^ (m++ == 2) && (m++ == 3);
        System.out.println(bool);
        System.out.println(m);
    }
}
