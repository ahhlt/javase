public class YangHui{
	public static void main(String[] args){
		//��ӡ�������
		// 1.��ά����ÿ�е�Ԫ�ظ�����������,
		//  arr[i].length = i+1 -> int arr[i] = new int[i+1]
		// 2.ÿ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض�Ϊ1
		//  if j==0 �� j==arr[i].length-1  arr[i][j] = 1
		// 3.������ǵ�һ�������һ��Ԫ�� 
		// �Ǿ͸�ֵΪ ��Ԫ�ص���һ�е�Ԫ��+��һ��Ԫ�ص�ǰһ��Ԫ��
		// arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
		int[][] arr = new int[10][];

		for (int i = 0; i < arr.length; i++) {
			// ����ά�����һά����(��һ��)������������ͬ�ĵ�ַ�ռ�
			arr[i] = new int[i+1];
			// ������ά�����Ԫ��
			for (int j = 0; j < arr[i].length; j++) {
				// �ж��Ƿ�Ϊ��һ��Ԫ�ػ����һ��Ԫ��
				if (j == 0 || j == arr[i].length-1) {
					arr[i][j] = 1;
				}else{ // ������ǾͰ����ɸ�ֵ
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}

		//��ӡ
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}