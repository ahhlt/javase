// ��ʾString����ת�����������͵�ʹ��

public class StringToBasic{

	public static void main(String[] args){

		// 2.String ת��Ӧ�Ļ�������������Ҫʹ�ð�װ��
		String s1 = "123";
		// String ת byte
		byte b1 = Byte.parseByte(s1);
		// String ת short
		short sh1 = Short.parseShort(s1);
		// String ת int
		int i1 = Integer.parseInt(s1);
		// String ת long
		long l1 = Long.parseLong(s1);
		// String ת float
		float f1 = Float.parseFloat(s1);
		// String ת double
		double d1 = Double.parseDouble(s1);

		boolean bl1 = Boolean.parseBoolean("true");
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(bl1);

		// String ת char ��ָ��ȡString��Ӧ�����µ��ַ�
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		
	}
}