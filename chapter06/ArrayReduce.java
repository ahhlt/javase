import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
	
		Scanner inScanner = new Scanner(System.in);
		String flag = "";
		int[] arr = {1, 2, 3, 4, 5, 6};

		do{
			// 创建比arr长度少1的数组newArr
			int[] newArr = new int[arr.length - 1];
			// for循环遍历arr
			for (int i = 0; i < newArr.length; i++) {
				//将arr的值拷贝给newArr,最后一个丢弃
				newArr[i] = arr[i];
				
			}
			// 将arr指向newArr
			arr = newArr;
			//循环遍历打印出arr
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
			}
			if (arr.length > 1) {
				System.out.println("请输入是否继续缩减(y/n):");
				flag = inScanner.next();
			}else {
				System.out.println("当前长度= "+ arr.length + "不能再缩减");
				break;
			}
			//
		}while ("y".equals(flag));
	}
}