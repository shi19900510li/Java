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
        long val = 2633243244L;
        int decVal = 24;
        int hexVal = 0x1a;
        int oxVal = 032;
        int binVal = 0b1010;
        System.out.println(oxVal);

        float f2 = 123.4F;
        double d2 = 123.4;
        double d3 = 1.234e2;

        // 布尔值  存放的数据时01，但是不能用01赋值
        boolean bb = true;

        // 练习字面值
        byte bb0 = 34;
        short ss = 300;
        int ii = 1000;
        long ll = 10000L;
        double dd = 123.213;
        char cc = 'A';
        String strstr = "hello";

        // 类型转换
        byte bbb = 5;
        int ii1 = 10;
        int ii2 = 300;

        System.out.println("类型转换:" + "\n" + (byte)ii1);
        System.out.println((byte)ii2);
        System.out.println(Integer.toBinaryString(ii2));

        // 练习
        short a0 = 1;
        short b0 = 2;

        System.out.println(getType(b0));

        // Java中的命名规则
        nameRules();

        // Java的作用域
        codeScope();

        // final修饰符
        learnFinal(3);

        // Java表达式
        javaExpression();
    }

    private static void nameRules() {
        // 变量名字：字母、数字、_、$
        // 首字母不能为数字
        int a = 5;
        int a_$1 = 6;
        int _003 =  2;
        // 尽量使用完整的单词命名
        String name = "东哥";
    }

    private static void codeScope() {
        // 变量不同位置有不同的名称：字段、属性，参数，局部变量
        Scope scope = new Scope();
        scope.print(2);
    }

    private static class Scope {
        int i = 1;
        public void print(int i) {
            System.out.println(i);
        }
    }

    private  static void learnFinal(final int j) {
        // 被final修饰的变量只能赋值一次。修饰参数，参数也不能再次赋值
        final int i = 1;
//        i = 2;
//        j = 2;
    }

    public static String getType(Object o) {
        return o.getClass().toString();
    }

    public static void javaExpression() {
        // 表达式由变量、操作符和方法调用构成的结构
        int i = 5;
        System.out.println("javaExpression");
    }
}
