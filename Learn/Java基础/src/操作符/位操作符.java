package 操作符;

public class 位操作符 {
    public static void main(String[] args) {
        /*
        *   1.Integer.toBinaryString()      整数的二进制字符串
        *   2. |    位或
        *   3. &    位与
        *   4. ^    异或
        *   5. ~    取非
        *   6. <<   左移  1位*2
        *   7. >>   右移  1位/2
        *   8. >>>  无符号右移
        *   1111 1111 1111 1111 1111 1111 1111 1010
        *   复数二进制表示是其原码的补码,补码为反码加1
        *   原码  0000 ... 0101
        *   反码  1111 ... 1010
        *   补码  1111 ... 1011
        * */
        int i0 = -2;
        int i1 = 5;
        int i2 = 6;
        System.out.println(Integer.toBinaryString(i0));
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toBinaryString(i2));
        System.out.println(Integer.toBinaryString(-i2));
        System.out.println("位与：" + (i1 & i2));
        System.out.println("位或：" + (i1 | i2));
        System.out.println("异或：" + (i1 ^ i2));
        System.out.println("取非：" + (~i1)); // 取非是复数，复数已补码的形式表示，求原码为-6
        System.out.println("左移：" + (i1  << 1));
        System.out.println("右移：" + (i2 >> 1));
        System.out.println("无符号右移：" + (i1 >>> 2));

        int i3 = 3; // 11
        int i4 = 2; // 10
        int c = ((i3 | i4) ^ (i3 & i4)) << 2 >>> 1;
        System.out.println(c);
    }
}
