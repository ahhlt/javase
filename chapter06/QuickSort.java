
// ��������
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
		System.out.println("��ʼ����");

		while(i < j){
			// ���������ҳ�һ���Ȼ�׼ֵС��Ԫ��
			while(i < j && nums[j] >= nums[left]){
				j--;
			}
			// ���������ҳ�һ���Ȼ�׼ֵ���Ԫ��
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