public class Homework05{
	public static void main(String[] args){

		//�����µ�����
		// 1.���ȴ���һ������Ϊ10����������
		int[] arr = new int[10];
		// 2.���������������������
		for (int i = 0; i < arr.length; i++) {
			// �������10��1-100�������浽������
			double randomNum = Math.random()*100;
			arr[i] = (int)randomNum;
		}

		// 3.���������¼���ֵ�����ֵ�±��Լ�ƽ��ֵ���ܺ�
		int sum = 0;
		double avgNum = 0;
		int maxNum = 0;
		int maxNumIndex = 0;
		// �Ƿ���8�ı�־
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			// �����������������Ԫ�� > maxNum
			// �ͽ�maxNum��Ϊ��Ԫ�أ������¸�Ԫ���±�
			if (arr[i] > maxNum) {
				maxNum = arr[i];
				maxNumIndex = i;
			}
			// ����ܺͲ�����ƽ��ֵ
			sum += arr[i];
			avgNum = sum/arr.length;

			//�ж��Ƿ���8
			if(arr[i] == 8){
				flag++; // �����8��+1
			}
		}
        
		// �����ӡ
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		//�����ӡ
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();


		//ʹ��ð�������������в���
		// �������� ���������
		// ���ð������Ч�ʺܵͣ�ѧϰ����ʦ�Ĵ���
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] > arr[i + 1]) {
					//��������ƶ�
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("���ֵ= " + maxNum);
		System.out.println("���ֵ�±�= " + maxNumIndex);
		System.out.println("�ܺ�= " + sum);
		System.out.println("ƽ��ֵ= " + avgNum);
	}
}