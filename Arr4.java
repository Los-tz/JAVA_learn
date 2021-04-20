
public class Arr4 {
	public static void main(String[] args) {
		//二维数组初始化
		int[][] arr1 = new int[][] {{1,2,3},{4,5,6}};
		String[][] arr2 = new String[3][];
		
		//二维数组调用
		arr2[0] = new String[3];
		System.out.println(arr1[1][2]);
		System.out.println(arr2[0][1]);
		
		//获取数组长度
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr2.length);
		
		//遍历二维数组
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		// 默认初始化值
			int[][] arr3 = new int[3][3];
			System.out.println(arr3[0]);
			System.out.println(arr3[1]);
			System.out.println(arr3[0][0]);
			
		//杨辉三角
			int[][] yh = new int[10][];
			for(int i = 0; i < yh.length; i++) {
				yh[i] = new int[i + 1];
				yh[i][0] = 1;
				yh[i][i] = 1;
				if(i > 1) {
					for(int j = 1; j < yh[i].length - 1; j++) {
						yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];
					}
				}
			}
			for(int i = 0; i < yh.length; i++) {
				for(int j = 0; j < yh[i].length; j++) {
					System.out.print(yh[i][j] + " ");
				}
				System.out.println();
			}

	}
}
