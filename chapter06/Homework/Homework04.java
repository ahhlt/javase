public class Homework04{

	public static void main(String[] args){

		int[] arr = new int[]{10,12,46,90};

		// ����ǰ��ӡ����
		System.out.print("����ǰ��");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		int index = -1; //��������λ��
		int insertNum = 100; //Ҫ�������ֵ
		// ����������insertNum��ȣ���ȷ��index
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= insertNum) {
				index = i+1; //ȷ��λ��
			}else{
				index = arr.length; //����м�û�У��Ͳ��뵽���
			}
		}

		// �����µ�����
		int[] newArr = new int[arr.length + 1];

		// ��ʼ����index��ǰ������
		for (int i = 0; i < newArr.length; i++) {
			if (i < index) {
				newArr[i] = arr[i];
			}
			if (i == index) {
				newArr[index] = insertNum;

			}
			if (i > index) {
				newArr[i] = arr[i-1];
			}
		}
		System.out.println();
		for (int num : newArr) {
			System.out.print(num + " ");
		}
		

	}
}