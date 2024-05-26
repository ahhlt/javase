// 演示数组扩容
public class ArrayExpansion{

	public static void main(String[] args){

		int[] arr = new int[]{1,2,3,4,5};
		// 创建新数组，长度为旧数组的1倍
		int[] newArr = new int[arr.length*2];
		// 将旧数组中的值赋给新数组
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		// 再向数组中添加3个数据
		newArr[5] = 10;
		newArr[6] = 20;
		newArr[7] = 30;

		// 将newArr重新赋值给arr
		arr = newArr;
		// 遍历数组
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}