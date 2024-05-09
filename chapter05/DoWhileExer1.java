public class DoWhileExer1{
	public static void main(String[] args){
		//需求：使用do..while打印1-200之间
		//    能被5整除不能被3整除的个数
		//化繁为简：
		//1.先打印1-200的整数
		//2.声明一个初始int变量i=1,循环外声明一个变量count 用于存放满足条件的数的个数
		//3.if语句判断是否满足条件 i%5==0 && i%3!=0
		//4.若满足条件 执行count++
		//
		//先死后活：
		//1.将控制范围的常量 设置为变量start和end
		//2.将条件中的5和3分别设置为变量num1和num2
		//
		int start = 1;
		int end = 200;
		int count = 0;
		int num1 = 5;
		int num2 = 3;
		do{
			//System.out.println(i);
			if (start % num1 == 0 && start % num2 != 0) {
				count++;
			}
			start++;
		}while(start<=end);
		System.out.println("满足条件的数的个数=" + count);
		
	}
}