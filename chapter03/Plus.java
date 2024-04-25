// 演示+号的使用

public class Plus{
	public static void main(String[] args){

		// 1.两边都是数值型，直接做加法运算
		System.out.println(100 + 98); //198
		// 2.当有一边是字符串，则做拼接运算
		System.out.println("100" + 98); //10098
		// 3.运算顺序从左到右
		System.out.println(100 + 3 + "hello"); //103hello
		System.out.println("hello" + 100 + 3); //hello1003
		
	}
}