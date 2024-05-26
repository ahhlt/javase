public class Homework07{
	public static void main(String[] args){

		int[] nums = new int[]{2, 4, 1, 0, 3, 5};

		for (int num : nums) {
			System.out.print(num + " ");
		}
		// ц╟ещеепР
		for (int i =0; i < nums.length; i++) {
			
			for (int j = 0; j < nums.length - 1 - i ; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println();
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}