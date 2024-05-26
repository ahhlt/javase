// 双指针法实现数组倒置

public class ArrayReverse1{

	public static void main(String[] args){

		int[] arr = new int[]{1,2,3,4,5,6};

		// 定义两个指针
		int left = 0;
		int right = arr.length-1;

		while(right > left){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		// 遍历数组
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}