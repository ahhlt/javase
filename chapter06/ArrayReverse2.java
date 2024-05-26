// 借助另一个数组，通过逆序赋值法实现数组倒置

public class ArrayReverse2{

	public static void main(String[] args){

		int[] arr = new int[]{1,2,3,4,5,6};

		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		// 声明另一个数组，长度一致
		int[] tempArr = new int[arr.length];

		// 逆序遍历数组arr，并将值顺序赋给tempArr
		for (int i = arr.length - 1; i >= 0; i--) {
			tempArr[tempArr.length-i-1] = arr[i];
		}

		arr = tempArr; //将反转后的数组重新赋给arr
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}