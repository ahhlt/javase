// 赋值运算符演示

public class SetValueOperator{

	public static void main(String[] args){
	
		int n = 10;
		// 1.当"`=`"两边数据类型不一致时，
		// 	 可以使用`自动类型提升`或`强制类型转换`进行处理
		long l1 = n; //自动类型转换
		byte b1 = (byte)(n);
		// 2.允许连续赋值
		int a, b;
		a = b = 100;
		// 3.复合赋值运算符会进行`类型转换`，底层具有`强制类型转换符`
		byte n1 = 12;
		n1 += 3; //等价于n1=(byte)(n1+3) 
		System.out.println(n1); 
		 System.out.println("Type of n1: " + ((Object)n1).getClass().getName());
	}
}