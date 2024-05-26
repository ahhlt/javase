// 实现二分查找

public class BinarySearch{

	public static void main(String[] args){

		int[] arr = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
		int target = 55;
		// 通过二分查找，找到target，并返回index
		// 条件：数组必须有序，逆序、倒序
		// 1.设定头head尾tail，且
		int head = 0;
		int tail = arr.length - 1;
		int count = 0; //记录循环几次找到目标
		int mid = 0;
		while (head <= tail) {
			mid = (head + tail) / 2;
			if (target == arr[mid]) {
				System.out.println("找到了" + target + "下标为index=" + mid);
				break;
			}else if (target > arr[mid]) {
				head = mid + 1;
				tail = tail - 1;

			}else if (target < arr[mid]) {
				tail = mid - 1;
				head = head +1;
			}
			count++;
			System.out.println("没找到");
		}
		System.out.println("count=" + count);
	}
}