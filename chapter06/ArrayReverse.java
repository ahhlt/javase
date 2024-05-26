// 演示数组的反转

public class ArrayReverse{

	public static void main(String[] args){

		// 声明并初始化数组
		int[] arr = new int[]{1, 2, 3, 4, 5, 6};

		// 遍历数组
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// 规律： 0 -- 5 i=0  arr[i] = arr[arr.length - i -1]
		// 		  1 -- 4 i=1
		// 		  2 -- 3 i=2
		// 交换次数为数组长度的一半 arr.length / 2 - 1
		for (int i = 0; i < arr.length / 2 - 1; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		System.out.print("\n反转后");
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}