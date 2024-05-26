public class TwoDimensionalArray3{
	public static void main(String[] args){
		// 思路分析：
		// 1.定义一个有3行的二维数组，3行就代表二维数组中有3个一维数组
		int[][] arr = new int[3][]; 
		// 创建3行的数组，因为内层一维数组的长度不一样，所以先不要定义里面的数组的长度
		// 2.使用for循环 分别给内层数组开辟对应的空间(长度)
		for (int i = 0; i < arr.length; i++) {
			//给数组内的数组开辟空间，因为第一个数组，有一个元素且i是从0开始，所以需要i+1
			arr[i] = new int[i+1];// 第一个子数组长度为1，第二个长度为2...
			//给数组的元素赋值，遍历二维数组内的一维数组
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