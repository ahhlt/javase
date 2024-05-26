// 动态给数组添加元素
import java.util.Scanner;
public class ArrayAdd{

	public static void main(String[] args){

		int[] arr = {1, 2, 3};

		boolean flag = true; //控制死循环
		Scanner myScanner = new Scanner(System.in); //用于获取用户输入
		
		while(flag){

			int[] newArr = new int[arr.length + 1]; //创建比arr长度大1的数组
			// 将arr中数组添加过来
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			System.out.print("数组已扩容，请输入要添加的元素：");
			//int num = myScanner.nextInteger();
			newArr[newArr.length-1] = myScanner.nextInt(); //将用户输入添加数组中
			arr = newArr;
			System.out.print("元素已添加：");
			for (int num : arr) {
				System.out.print(num + " ");
			}

			System.out.print("\n是否需要继续添加元素(y或n):"); //提示用户是否继续添加元素
			String input = myScanner.next();
			//System.out.print(input);
			if ("y".equals(input)) { //判断用户输入，y表示继续驶入
				
			}else if ("n".equals(input)) {
				flag = false;
			}else{
				System.out.print("输入有误");
				flag = false;
			}
			
		}
	}
}