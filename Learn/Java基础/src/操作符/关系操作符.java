package 操作符;

import java.util.Scanner;

public class 关系操作符 {
    public static void main(String[] args) {
        // > < >= <= == !=
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("第一个整数：" + a);
        int b = sc.nextInt();
        System.out.println("第二个整数：" + b);

        System.out.println(a + ">" + b + "：" + (a > b));
        System.out.println(a + "<" + b + "：" + (a < b));
        System.out.println(a + ">=" + b + "：" + (a >= b));
        System.out.println(a + "<=" + b + "：" + (a <= b));
        System.out.println(a + "==" + b + "：" + (a == b));
        System.out.println(a + "!=" + b + "：" + (a != b));

    }
}
