// ��ʾ����ķ�ת

public class ArrayReverse{

	public static void main(String[] args){

		// ��������ʼ������
		int[] arr = new int[]{1, 2, 3, 4, 5, 6};

		// ��������
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// ���ɣ� 0 -- 5 i=0  arr[i] = arr[arr.length - i -1]
		// 		  1 -- 4 i=1
		// 		  2 -- 3 i=2
		// ��������Ϊ���鳤�ȵ�һ�� arr.length / 2 - 1
		for (int i = 0; i < arr.length / 2 - 1; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		System.out.print("\n��ת��");
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}