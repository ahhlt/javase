public class TwoDimensionalArray3{
	public static void main(String[] args){
		// ˼·������
		// 1.����һ����3�еĶ�ά���飬3�оʹ����ά��������3��һά����
		int[][] arr = new int[3][]; 
		// ����3�е����飬��Ϊ�ڲ�һά����ĳ��Ȳ�һ���������Ȳ�Ҫ�������������ĳ���
		// 2.ʹ��forѭ�� �ֱ���ڲ����鿪�ٶ�Ӧ�Ŀռ�(����)
		for (int i = 0; i < arr.length; i++) {
			//�������ڵ����鿪�ٿռ䣬��Ϊ��һ�����飬��һ��Ԫ����i�Ǵ�0��ʼ��������Ҫi+1
			arr[i] = new int[i+1];// ��һ�������鳤��Ϊ1���ڶ�������Ϊ2...
			//�������Ԫ�ظ�ֵ��������ά�����ڵ�һά����
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}
        
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}