
// 快速排序
public class QuickSort{
	public static void main(String[] args){

		int[] nums = new int[]{2, 4, 1, 0, 3, 5};

		int left = 0;
		int right = nums.length - 1;
		for (int num : nums) {
			System.out.print(num + " ");
		}
		int i = 0;
		int j = nums.length - 1;
		System.out.println("开始排序");

		while(i < j){
			// 从右向左找出一个比基准值小的元素
			while(i < j && nums[j] >= nums[left]){
				j--;
			}
			// 从左向右找出一个比基准值大的元素
			while(i < j && nums[i] <= nums[left]){
				i++;
			}
			
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			for (int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println("");

		}
		int temp = nums[i];
		nums[i] = nums[left];
		nums[left] = temp;
		for (int num : nums) {
			System.out.print(num + " ");
		}


	}
}