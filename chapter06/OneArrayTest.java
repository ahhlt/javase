public class OneArrayTest {
    public static void main(String[] args) {

        // 数组的声明
        int[] ints; // 或int ints[];
        int ints1[];
        // 数组初始化
        // 1)静态初始化：数组变量赋值与数组元素赋值同时进行
        ints = new int[]{1, 2, 3, 4, 5, 6};
        String[] strings = {"1", "2", "3", "4", "5"};
        // 2)动态初始化：先数组变量赋值，再给数组的元素赋值
        // 2.1)数组变量赋值
        double[] doubles = new double[4];
        // 2.2)元素赋值
        doubles[0] = 1.0;
        doubles[1] = 1.0;
        doubles[2] = 1.0;
        doubles[3] = 1.0;

        // 数组元素的调用：通过数组下标直接访问
        // 语法：数组名[下标];
        // 下标的范围是 0~数组长度-1，数组下标越界会报错
        System.out.println("doubles[1]=" + doubles[1]);

        // 数组的长度：数组名.length
        System.out.println("doubles的长度=" + doubles.length);

        // 数组的遍历
        for (int i = 0; i < doubles.length; i++) {
            System.out.println("doubles[" + i + "]=" + doubles[i]);
        }

        // 数组元素的默认初始化值
        // 1)整型数组元素默认初始化值为0
        byte[] bytes = new byte[3];
        short[] shorts = new short[3];
        int[] ints2 = new int[3];
        long[] longs = new long[3];
        System.out.println("bytes[0]=" + bytes[0] +
                " shorts[0]=" + shorts[0] +
                " ints[0]=" + ints2[0] +
                " longs[0]=" + longs[0]);
        // 2)浮点型数组元素默认初始化值为0.0
        float[] floats = new float[3];
        double[] doubles1 = new double[3];
        System.out.println("floats[0]=" + floats[0] +
                " doubles1[0]=" + doubles1[0]);
        // 3)字符型数组元素默认初始化值为\u0000
        char[] chars = new char[3];
        System.out.println("chars[0]=" + chars[0]);
        // 4)布尔型数组元素默认初始化值false
        boolean[] booleans = new boolean[3];
        System.out.println("booleans[0]="+booleans[0]);
        // 5)引用类型数组元素默认初始化值为null
        String[] strings1 = new String[3];
        System.out.println("strings1[0]="+strings1[0]);
    }
}