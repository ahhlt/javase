// 演示Char字符的使用细节

public class CharDetail{
	// 主方法，程序的入口
	public static void main(String[] args){
		//字符常量必须使用单引号('')括起来的单个字符，
		//如果用双引号("")括起来，即使是单个字符也会被认为是字符串
	

		//在java中，char的本质是一个整数，在输出时是unicode编码对应的字符
		//char类型数据，默认输出是unicode编码对应的字符，若想输出对应整数可 
		char c1 = 97; 
		System.out.println(c1); //输出97对应的字符a
		char c2 = 'a';
		System.out.println((int)c2);//强制类型转换，输出a对应的整数
		char c3 = '韩';
		System.out.println((int)c3); //输出对应的整数
		char c4 = 38889;
		System.out.println((int)c4);//输出对应数字
		System.out.println(c4);// 输出 韩

		//char类型是可以进行运算的，相当于一个整数
		System.out.println('a' + 10);// 将a转换成数字再加10  结果为107
		c2 = 'a' + 10;
		System.out.println(c2);
		char c5 = 'b' + 1;
		System.out.println((int)c5); //输出99
		System.out.println(c5); // 输出字符 c
	}
}