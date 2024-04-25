// 演示自动类型转换的细节

public class AutoConvertDetail{
	public static void main(String[] args){

		//细节1：有多种类型的数据混合运算时
		//系统自动将所有数据转换成容量最大的那种数据类型，再进行计算
		int n1 = 10; // ok
		// float d1 = n1 + 1.1;//错误，1.1默认为double类型，计算时n1会被转换成double类型
		// 二者的计算结果也就是double类型，将double类型数据赋值给float类型变量是不允许的。
		double d1 = n1 + 1.1;// 这样是正确的
		float d2 = n1 +1.1f; //这里的1.1为float类型，同理n1会被转换为float类型(float > int)
		// 计算结果为float类型，赋值给float类型的d1没有问题
		

		//细节2：当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时就会报错
		//反之就会进行自动类型转换（自动类型提升）
		//
		//int n2 = 1L;   long类型更大，会报错
		long n2 = 1;  //1为整数默认为int类型 自动类型转换 int -> long

		// 细节3：(byte short) 和char之间不会相互自动转换
		// 当把具体数赋值给byte时，
		// (1)先判断该数值是否在byte范围内，如果是就可以赋值
		// (2)如果赋值的是另一个变量，就会先判断类型
		byte b1 = 10; // 直接赋值会判断是否在byte范围内-128~127
		int n2 = 1;   // n2为int类型
		byte b2 = n2; // 因为n2不是具体数值而是一个变量，将int类型的n2赋值给byte类型的b2显然是不成立的
		//因为n2是int类型占用4个字节，byte是1个字节。
		

		// 细节4：byte short char 三者可以计算，在计算时首先转换为int类型
		// 只要有以上3种类型参与计算，就会首先转换为int类型，再计算
		byte b2 = 1;
		short s1 = 1;
		short s2 = b2 + s1;// 错 byte + short => int, b2 + s1计算会先转换为int，计算结果也为int
		//int赋值给short会有损失，不允许
		//
		byte b4 = b2 + b3; //byte + byte => int

		// 细节5：boolean类型不参与类型的自动转换

	}
}