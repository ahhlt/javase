// ʵ��ð������

public class BubbleSort{

	public static void main(String[] args){

		int[] arr = new int[]{24, 69, 80, 57, 13, 111, 85, 10};
		for (int num : arr) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 -i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}