// ��̬���������Ԫ��
import java.util.Scanner;
public class ArrayAdd{

	public static void main(String[] args){

		int[] arr = {1, 2, 3};

		boolean flag = true; //������ѭ��
		Scanner myScanner = new Scanner(System.in); //���ڻ�ȡ�û�����
		
		while(flag){

			int[] newArr = new int[arr.length + 1]; //������arr���ȴ�1������
			// ��arr��������ӹ���
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			System.out.print("���������ݣ�������Ҫ��ӵ�Ԫ�أ�");
			//int num = myScanner.nextInteger();
			newArr[newArr.length-1] = myScanner.nextInt(); //���û��������������
			arr = newArr;
			System.out.print("Ԫ������ӣ�");
			for (int num : arr) {
				System.out.print(num + " ");
			}

			System.out.print("\n�Ƿ���Ҫ�������Ԫ��(y��n):"); //��ʾ�û��Ƿ�������Ԫ��
			String input = myScanner.next();
			//System.out.print(input);
			if ("y".equals(input)) { //�ж��û����룬y��ʾ����ʻ��
				
			}else if ("n".equals(input)) {
				flag = false;
			}else{
				System.out.print("��������");
				flag = false;
			}
			
		}
	}
}