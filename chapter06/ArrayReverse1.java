// ˫ָ�뷨ʵ�����鵹��

public class ArrayReverse1{

	public static void main(String[] args){

		int[] arr = new int[]{1,2,3,4,5,6};

		// ��������ָ��
		int left = 0;
		int right = arr.length-1;

		while(right > left){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		// ��������
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}