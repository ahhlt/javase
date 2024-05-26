// 演示数组的赋值
public class ArrayAssignment{

	public static void main(String[] args){

		/**
		 * 数组的赋值
		 */
		
		// 声明两个数组
		int[] arr1, arr2;
		// 初始化arr1
		arr1 = new int[]{2, 3, 5, 11, 13, 17, 19};
		// 遍历arr1
		System.out.println("首次遍历arr1");
		for (int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 将arr1赋值给arr2
		arr2 = arr1; //将arr1的引用地址赋给arr2
		// 遍历arr2
		System.out.println("遍历arr2");
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// 修改arr2的值
		arr2[0] = 0;
        arr2[2] = 0;
        arr2[4] = 0;
        arr2[6] = 0;

        // 再次遍历arr1，发现arr1也发生变化
        System.out.println("再次遍历arr1");
		for (int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}