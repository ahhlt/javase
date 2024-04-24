// 这是java的快速入门，演示java的开发步骤

// 对代码的相关说明
// 1.public class Hello，表示Hello是一个public类型的类
// 2.Hello{}，表示一个类的开始和结束，类体
// 3.public static void main(String[] args)，表示一个主方法，程序的入口
// 4.main(){}，表示方法的开始和结束，方法体
// 5.System.out.println("hello, wrold!");，一条输出语句，输出hello, wrold!
// 6.;，分号表示语句的结束
public class Hello{
	// 主方法，程序的入口
	public static void main(String[] args){
		System.out.println("hello, wrold!");
	}
}

// 演示开发细节和注意事项
// 一个源文件中最多只能有一个public类，其他类不限
// 每个类在编译时都会生成一个对应的.class文件
class Dog{
    // 这是一个名为Dog的类
    // main()方法也可以写在非public类中，这样可以指定运行非public类
    public static void main(String[] args){
    	System.out.println("这是一个名为Dog的类");
    }
    
}

class Cat{
    // 这是一个名为Cat的类
    public static void main(String[] args){
    	System.out.println("这是一个名为Cat的类");
    }
   
}