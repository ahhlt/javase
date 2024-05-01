
// 演示四种进制的输出
public class BinaryTest{

	public static void main(String[] args){
		// 体会相同数字在不同进制下的表数
		// 2进制
		int n1 = 0b1010;
		// 10进制
		int n2 = 1010;
		// 8进制
		int n3 = 01010;
		// 16进制
		int n4 = 0x1010;

		System.out.println("n1 = " + n1); //10
		System.out.println("n2 = " + n2); //1010
		System.out.println("n3 = " + n3); //520
		System.out.println("n4 = " + n4); //4112
	}
}