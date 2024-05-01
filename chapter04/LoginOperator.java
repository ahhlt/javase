// 演示逻辑运算符的使用

public class LoginOperator{
	public static void main(String[] args){

		// 短路与&&和逻辑与&：同true为true
		// 	符号两边都必须为true时，结果才是true
		// 1.短路与&&
		int age = 50;
		if (age > 20 && age < 90) {
			System.out.println("ok100");
		}
		// 2.逻辑与&
		if (age > 20 & age < 90) {
			System.out.println("ok200");
		}
		// 短路与&&和逻辑与&的区别
		// 	短路与&&：如果&&左边为false，则不再执行&&右边的表达式，结果为false
		// 	逻辑与&：即使&左边为flase，依旧执行&右边表达式
		int a = 4;
        int b = 9;
        // 短路与&&
        if(a < 1 && ++b < 50){ // a<1为false，不再执行++b<50
            System.out.println("ok300");
        }
        System.out.println("a=" + a + ", b=" + b); //a=4 b=9
        // 逻辑与&
        if(a < 1 & ++b < 50){ // 即使第1个条件为false，依旧执行第2个条件，此时a=4，b=10
            System.out.println("ok400");
        }
		System.out.println("a=" + a + ", b=" + b);


		// 短路或||和逻辑或|：有true为true
		// 	符号两边只要有一个为true，结果就为true
		// 3.短路或
		int x = 5;
		if (x > 0 ||  ++x < 4) { //有一个true就是true
			System.out.println("ok500");
		}
		// 4.逻辑或|
		if (x > 0 | ++x < 4) { //有一个true就是true，这里会执行++x，x=6
			System.out.println("ok600"); //
		}

		// 短路或和逻辑或的区别
		//  短路或||：只有第1个条件为false，才会再执行第2个条件
		//  逻辑或|：即使第1个条件为true，也会执行第2个条件
		if (x > 0 || ++x<4) { //有一个true就是true
			System.out.println("ok700");
		}
		System.out.println("x = " + x); // 不会执行++x，x=6

		// 逻辑或|
		if (x > 0 | ++x < 4) { //有一个true就是true，这里执行++x
			System.out.println("ok800");
		}
		System.out.println("x = " + x); // x=7

	}
}