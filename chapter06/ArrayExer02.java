
public class ArrayExer02{

	public static void main(String[] args){

		int[] arr = {4, -1, 99, 10, 23};
		int maxValue = 0;
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
				index = i;
			}
		}

		System.out.print("×î´óÖµ="+maxValue+"£¬index="+index);
	}
}