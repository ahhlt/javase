public class YangHui{
	public static void main(String[] args){
		//打印杨辉三角
		// 1.二维数组每行的元素个数等于行数,
		//  arr[i].length = i+1 -> int arr[i] = new int[i+1]
		// 2.每行的第一个元素和最后一个元素都为1
		//  if j==0 或 j==arr[i].length-1  arr[i][j] = 1
		// 3.如果不是第一个或最后一个元素 
		// 那就赋值为 该元素的上一行的元素+上一行元素的前一列元素
		// arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
		int[][] arr = new int[10][];

		for (int i = 0; i < arr.length; i++) {
			// 给二维数组的一维数组(第一层)开辟与行数相同的地址空间
			arr[i] = new int[i+1];
			// 遍历二维数组的元素
			for (int j = 0; j < arr[i].length; j++) {
				// 判断是否为第一个元素或最后一个元素
				if (j == 0 || j == arr[i].length-1) {
					arr[i][j] = 1;
				}else{ // 如果不是就按规律赋值
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}

		//打印
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}