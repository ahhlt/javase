// ʵ�ֶ��ֲ���

public class BinarySearch{

	public static void main(String[] args){

		int[] arr = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
		int target = 55;
		// ͨ�����ֲ��ң��ҵ�target��������index
		// ��������������������򡢵���
		// 1.�趨ͷheadβtail����
		int head = 0;
		int tail = arr.length - 1;
		int count = 0; //��¼ѭ�������ҵ�Ŀ��
		int mid = 0;
		while (head <= tail) {
			mid = (head + tail) / 2;
			if (target == arr[mid]) {
				System.out.println("�ҵ���" + target + "�±�Ϊindex=" + mid);
				break;
			}else if (target > arr[mid]) {
				head = mid + 1;
				tail = tail - 1;

			}else if (target < arr[mid]) {
				tail = mid - 1;
				head = head +1;
			}
			count++;
			System.out.println("û�ҵ�");
		}
		System.out.println("count=" + count);
	}
}