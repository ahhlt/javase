public class FloatDetial{
	public static void main(String[] args){
		//Java的浮点类型常量默认为double型，声明float型常量须后加“f”或“F”
		// float n1 = 1.1; 是错误的，1.1默认为double，而n1为float型只有4个字节无法容下double型的8个字节
		// 必须以下方法写
		float num2 = 1.1F; //对 
		double num3 = 1.1; //对
		double num4 = 1.1f;//对

		// 浮点型两种表示形式
		//十进制数形式：如，5.12  512.0f .512(必须有小数点)
		float n = .123f; // 等价于0.123
		System.out.println(n);
		//科学计数法形式：如，5.12e2[5.12乘10的2次方]  
		//5.12E-2[5.12乘10的-2次方]
		System.out.println(5.12e2);
		System.out.println(5.12E-2); // 5.12乘10的负2次方 

		//通常情况下，应该使用double类型，因为它的精度比float更高
		//举例说明 double num9 = 2.1234567851;
		//float num10 = 2.1234567851f;
		//float精度不高，超出内存空间的值会被丢掉
		double num9 = 2.1234567851;
		float num10 = 2.1234567851f;
		System.out.println(num9);
		System.out.println(num10);

		//浮点数使用陷阱：2.7和8.1/3
		double num11 = 2.7;
		double num12 = 8.1/3;
		System.out.println(num11);
		System.out.println(num12);//接近2.7的一个结果而不是2.7
        
		//一个重要的使用点，当我们对运算结果是小数的进行相等判断时，要小心
		if (num11 == num12) {
			System.out.println("相等");
		}
		//正确的写法
		//应该是以两个数的差值的绝对值，在某个精度范围内判断
		if (Math.abs(num11 - num12) < 0.000001) {
			System.out.println("差值很小，认为相等");
		}
		//细节：如果是直接查询的小数或直接赋值的小数，是可以直接判断相等
	}
}