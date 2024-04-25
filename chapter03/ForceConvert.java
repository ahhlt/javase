// 演示强制类型转换的使用

public class ForceConvert{
	public static void main(String[] args){

		//演示强制类型转换
		int n1 = (int)1.9;
		System.out.println("n1=" + n1);//精度损失

		int n2 = 2000;
		byte b1 = (byte)n2;//将int类型强制转换为byte会溢出
		System.out.println("b1=" + b1);//数据溢出

		char c1 = 'a'; //97
		float f1 = (float)c1;// 按整数类型97强制转换为float 97.0
		System.out.println("f1=" + f1);

	}

}