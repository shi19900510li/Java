package 操作符;

import java.util.Scanner;

public class 算数操作符 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("第一个整数：" + a);
//        int b = sc.nextInt();
//        System.out.println("第二个整数：" + b);
//        System.out.println("两个数的和是：" + (a + b));

        // 如果有任何运算单元的长度超过Int,则运算结果按照最长的计算
        int i = 5;
        long j = 8;
        int sum = (int) (i + j); // i+j为long类型

        // 如果任何运算单元的长度都小于Int,则运算结果按照Int计算
        short m = 2;
        byte n = 5;
        int sum2 = m + n; // 小于Int转换成Int

        // 取模
        int modular = m % n;
        System.out.println(modular);

        // 自增、自减
        System.out.println(m++ + --m + --n);
    }
}
