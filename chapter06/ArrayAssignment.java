// ��ʾ����ĸ�ֵ
public class ArrayAssignment{

	public static void main(String[] args){

		/**
		 * ����ĸ�ֵ
		 */
		
		// ������������
		int[] arr1, arr2;
		// ��ʼ��arr1
		arr1 = new int[]{2, 3, 5, 11, 13, 17, 19};
		// ����arr1
		System.out.println("�״α���arr1");
		for (int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// ��arr1��ֵ��arr2
		arr2 = arr1; //��arr1�����õ�ַ����arr2
		// ����arr2
		System.out.println("����arr2");
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// �޸�arr2��ֵ
		arr2[0] = 0;
        arr2[2] = 0;
        arr2[4] = 0;
        arr2[6] = 0;

        // �ٴα���arr1������arr1Ҳ�����仯
        System.out.println("�ٴα���arr1");
		for (int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}