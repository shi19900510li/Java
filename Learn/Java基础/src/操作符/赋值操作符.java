package 操作符;

import java.util.Scanner;

public class 赋值操作符 {
    /*
    *   = += -= /= *= &= |= %= <<= >>= ^= >>>=
    * */
    public static void main(String[] args) {
        int i1 = 1;
        System.out.println(i1 + ++i1);
        // 三元操作符 ？ ：
        Scanner sc = new Scanner(System.in);
        System.out.println("今天是周几？");
        int i2 = sc.nextInt();
        if (i2 < 6 && i2 >0) {
            System.out.println("今天工作日");
        } else if (i2 > 5 && i2 < 8) {
            System.out.println("今天双休日");
        } else {
            System.out.println("输入错误1");
        }
    }
}
