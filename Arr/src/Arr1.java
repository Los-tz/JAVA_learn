
public class Arr1 {
	public static void main(String[] args) {
	int[] a = new int[] {10,20};	//静态数组初始化
	String[] b = new String[2];	//动态数组初始化
	
	b[0] = "10";
	b[1] = "20";	//数组角标调用
	
	System.out.println(a.length);
	System.out.println(b.length);	//求数组长度
	
	for(int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}	//遍历数组
	
	int[] arr1 = new int[3];
	for(int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}	//整型数组默认初始化：0
	
	System.out.println("---------");
	float[] arr2 = new float[3];
	for(int i = 0; i < arr2.length; i++) {
		System.out.println(arr2[i]);
	}	//浮点型数组默认初始化：0.0
	
	System.out.println("-------");
	char[] arr3 = new char[3];
	for(int i = 0; i < arr3.length; i++) {
		System.out.println(arr3[i]);
	}
	if(0 == arr3[1]) {
		System.out.println("字符型数组默认初始化：0 '0'");
	}

	System.out.println("-------");
	boolean[] arr4 = new boolean[3];
	System.out.println(arr4[2]);	//布尔型数组默认初始化是false
	
	System.out.println("-------");
	String[] arr5 = new String[4];
	System.out.println(arr5[2]);	//数组元素是引用数据类型的默认初始化是 null
	}
}
