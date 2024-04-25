// 演示String类型转基本数据类型的使用

public class StringToBasic{

	public static void main(String[] args){

		// 2.String 转相应的基本数据类型需要使用包装类
		String s1 = "123";
		// String 转 byte
		byte b1 = Byte.parseByte(s1);
		// String 转 short
		short sh1 = Short.parseShort(s1);
		// String 转 int
		int i1 = Integer.parseInt(s1);
		// String 转 long
		long l1 = Long.parseLong(s1);
		// String 转 float
		float f1 = Float.parseFloat(s1);
		// String 转 double
		double d1 = Double.parseDouble(s1);

		boolean bl1 = Boolean.parseBoolean("true");
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(bl1);

		// String 转 char 是指获取String相应索引下的字符
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		
	}
}