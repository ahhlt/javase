// ��ʾ˳�����

public class LinearSearch{

	public static void main(String[] args){

		int[] arr = new int[]{11, 22, 33, 44, 5, 66, 77, 99};
		int targer = 5;
		boolean isFlag = true;
		// ˳����ң����Բ��ң�
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == targer) {
				System.out.println("�ҵ���" + targer + "�±�index=" + i);
				isFlag = false;
				break;
			}
		}
		if (isFlag) {
			System.out.println("����û�и�Ԫ��...");
		}
	}
}