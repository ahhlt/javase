
public class IfExer02{

	public static void main(String[] args){

		int num1 = 10;
		int num2 = 5;

		if (((num1 + num2) % 3 == 0) && ((num1 + num2) % 5 == 0)) {
			System.out.println("两数之和能被3和5整除");

		}else{
			System.out.println("buneng");
		}
	}
}