public class DoWhileExer0{
	public static void main(String[] args){
		//1.使用do..while打印1-100
		//2.计算1-100的和
		//化繁为简：
		//1.先打印1-100的整数
		//2.声明一个变量sum 用于存放和
		//3.将每一个1-100内的数都加到sum上
		//先死后活：
		//1.将控制范围的常量 设置为变量start和end
		//   就可以计算范围start-end之间的整数和
		//
		int start = 1;
		int end = 100;
		int sum =0;
		do{
			System.out.println(start);
			sum += start;
			start++;

		}while(start<=end);
		System.out.println("1-100的和= "+sum);
	}
}