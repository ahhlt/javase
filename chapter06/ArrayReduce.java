import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
	
		Scanner inScanner = new Scanner(System.in);
		String flag = "";
		int[] arr = {1, 2, 3, 4, 5, 6};

		do{
			// ������arr������1������newArr
			int[] newArr = new int[arr.length - 1];
			// forѭ������arr
			for (int i = 0; i < newArr.length; i++) {
				//��arr��ֵ������newArr,���һ������
				newArr[i] = arr[i];
				
			}
			// ��arrָ��newArr
			arr = newArr;
			//ѭ��������ӡ��arr
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
			}
			if (arr.length > 1) {
				System.out.println("�������Ƿ��������(y/n):");
				flag = inScanner.next();
			}else {
				System.out.println("��ǰ����= "+ arr.length + "����������");
				break;
			}
			//
		}while ("y".equals(flag));
	}
}