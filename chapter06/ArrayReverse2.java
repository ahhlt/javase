// ������һ�����飬ͨ������ֵ��ʵ�����鵹��

public class ArrayReverse2{

	public static void main(String[] args){

		int[] arr = new int[]{1,2,3,4,5,6};

		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		// ������һ�����飬����һ��
		int[] tempArr = new int[arr.length];

		// �����������arr������ֵ˳�򸳸�tempArr
		for (int i = arr.length - 1; i >= 0; i--) {
			tempArr[tempArr.length-i-1] = arr[i];
		}

		arr = tempArr; //����ת����������¸���arr
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}