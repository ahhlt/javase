// 演示数组的拷贝，地址空间独立
public class ArrayCopy{

	public static void main(String[] args){

		/**
		 * 数组的拷贝
		 */
		
		// 声明并初始化数组1
		int[] arr1 = new int[]{1, 2, 3, 4, 5};
		// 声明数组2长度与数组1一致
		int[] arr2 = new int[arr1.length];

		// 遍历arr1的值，并将值全部赋值给arr2对应的位置
		for (int i =0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// 遍历数组1和数组2
		for (int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}