// ��ʾ����Ŀ�������ַ�ռ����
public class ArrayCopy{

	public static void main(String[] args){

		/**
		 * ����Ŀ���
		 */
		
		// ��������ʼ������1
		int[] arr1 = new int[]{1, 2, 3, 4, 5};
		// ��������2����������1һ��
		int[] arr2 = new int[arr1.length];

		// ����arr1��ֵ������ֵȫ����ֵ��arr2��Ӧ��λ��
		for (int i =0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// ��������1������2
		for (int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}