
public class Test{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 6 & ++y == 6) { 
			System.out.println("ok700");
		}
		System.out.println("x = " + x); // ����ִ��++x��x=5

		// �߼���|
		if (x > 0 | ++x < 4) { //��һ��true����true
			System.out.println("ok800");
		}
		System.out.println("x = " + x); // x=6
		int i = 48;
		char ch = i + 1;
		System.out.println("ch = " + ch); // x=6
	}
}
