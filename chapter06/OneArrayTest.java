public class OneArrayTest {
    public static void main(String[] args) {

        // ���������
        int[] ints; // ��int ints[];
        int ints1[];
        // �����ʼ��
        // 1)��̬��ʼ�������������ֵ������Ԫ�ظ�ֵͬʱ����
        ints = new int[]{1, 2, 3, 4, 5, 6};
        String[] strings = {"1", "2", "3", "4", "5"};
        // 2)��̬��ʼ���������������ֵ���ٸ������Ԫ�ظ�ֵ
        // 2.1)���������ֵ
        double[] doubles = new double[4];
        // 2.2)Ԫ�ظ�ֵ
        doubles[0] = 1.0;
        doubles[1] = 1.0;
        doubles[2] = 1.0;
        doubles[3] = 1.0;

        // ����Ԫ�صĵ��ã�ͨ�������±�ֱ�ӷ���
        // �﷨��������[�±�];
        // �±�ķ�Χ�� 0~���鳤��-1�������±�Խ��ᱨ��
        System.out.println("doubles[1]=" + doubles[1]);

        // ����ĳ��ȣ�������.length
        System.out.println("doubles�ĳ���=" + doubles.length);

        // ����ı���
        for (int i = 0; i < doubles.length; i++) {
            System.out.println("doubles[" + i + "]=" + doubles[i]);
        }

        // ����Ԫ�ص�Ĭ�ϳ�ʼ��ֵ
        // 1)��������Ԫ��Ĭ�ϳ�ʼ��ֵΪ0
        byte[] bytes = new byte[3];
        short[] shorts = new short[3];
        int[] ints2 = new int[3];
        long[] longs = new long[3];
        System.out.println("bytes[0]=" + bytes[0] +
                " shorts[0]=" + shorts[0] +
                " ints[0]=" + ints2[0] +
                " longs[0]=" + longs[0]);
        // 2)����������Ԫ��Ĭ�ϳ�ʼ��ֵΪ0.0
        float[] floats = new float[3];
        double[] doubles1 = new double[3];
        System.out.println("floats[0]=" + floats[0] +
                " doubles1[0]=" + doubles1[0]);
        // 3)�ַ�������Ԫ��Ĭ�ϳ�ʼ��ֵΪ\u0000
        char[] chars = new char[3];
        System.out.println("chars[0]=" + chars[0]);
        // 4)����������Ԫ��Ĭ�ϳ�ʼ��ֵfalse
        boolean[] booleans = new boolean[3];
        System.out.println("booleans[0]="+booleans[0]);
        // 5)������������Ԫ��Ĭ�ϳ�ʼ��ֵΪnull
        String[] strings1 = new String[3];
        System.out.println("strings1[0]="+strings1[0]);
    }
}