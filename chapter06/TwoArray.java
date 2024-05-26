// 案例演示

public class TwoArray{

	public static void main(String[] args){

		int[][] arr = new int[][]{ {0, 0, 0, 0, 0, 0},
								   {0, 0, 1, 0, 0, 0},
								   {0, 2, 0, 3, 0, 0},
								   {0, 0, 0, 0, 0, 0},};
	    // 遍历数组
	    for (int i = 0; i < arr.length; i++) { //先遍历出数组内的每个一维数组
	    	for (int j = 0; j < arr[i].length; j++) { //再遍历一维数组中的元素
	    		System.out.print(arr[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	}
}