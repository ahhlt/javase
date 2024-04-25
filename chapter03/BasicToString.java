// 演示基本数据类型转String类型的使用

public class BasicToString{

	public static void main(String[] args){

		// 1.基本数据类型转String类型，直接与""拼接即可
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + s2 + s3 + s4);
	}
}