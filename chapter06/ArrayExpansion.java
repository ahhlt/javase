// ��ʾ��������
public class ArrayExpansion{

	public static void main(String[] args){

		int[] arr = new int[]{1,2,3,4,5};
		// ���������飬����Ϊ�������1��
		int[] newArr = new int[arr.length*2];
		// ���������е�ֵ����������
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		// �������������3������
		newArr[5] = 10;
		newArr[6] = 20;
		newArr[7] = 30;

		// ��newArr���¸�ֵ��arr
		arr = newArr;
		// ��������
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}