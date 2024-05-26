// 演示顺序查找

public class LinearSearch{

	public static void main(String[] args){

		int[] arr = new int[]{11, 22, 33, 44, 5, 66, 77, 99};
		int targer = 5;
		boolean isFlag = true;
		// 顺序查找（线性查找）
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targer) {
				System.out.println("找到了" + targer + "下标index=" + i);
				isFlag = false;
				break;
			}
		}
		if (isFlag) {
			System.out.println("数组没有该元素...");
		}
	}
}