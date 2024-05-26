import java.util.Scanner;
// 顺序查找案例
public class SeqSearch{

	public static void main(String[] args){

		String[] names = new String[]{"白眉鹰王", "青翼蝠王", "金毛狮王", "紫衫龙王"};

		Scanner myScanner = new Scanner(System.in);

		System.out.print("请输入要查找的姓名:");
		String input = myScanner.next();
		boolean isFlag = true;
		for (int i = 0; i < names.length; i++) {
			if (input.equals(names[i])) {
				System.out.println("找到了" + input + "下标index=" + i);
				isFlag = false;
			}
		}
		if (isFlag) {
			System.out.println("数组没有该元素...");
		}
	}
}