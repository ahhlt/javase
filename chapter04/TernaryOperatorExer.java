
public class TernaryOperatorExer{

	public static void main(String[] args){
		
		// 使用三元运算符实现三个数的最大值
		int a = 10;
		int b = 4;
		int c = 6;

		// 拆分：首先用三元运算符找出两个数的最大值
		int firstNum = ( a > b ) ? a : b; //选出a与b之间的较大值

		int maxNum = ( c > firstNum ) ? c : firstNum; //这就选出了a,b,c之间的最大值
		// 再将firstNum使用(( a > b ) ? a : b)替换
		int max_Num = (c > (( a > b ) ? a : b)) ? c : (( a > b ) ? a : b);

		System.out.println("maxNum = " + maxNum + ", max_Num = " + max_Num);

	}
}