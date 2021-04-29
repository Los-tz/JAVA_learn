import java.util.Random;

public class Arr5 {
	public static void main(String[] args) {
		int[] arr1 = new int[6];
		Random rand = new Random();
		int count = 0;
		while(count < arr1.length) {
			boolean flag = true;		//判断随机数是否重复的标志
			int r = rand.nextInt(29)+1;
			for(int i = 0; i < arr1.length; i++) {
				if(r == arr1[i]) {		//比较随机数和数组的数字是否重复
					flag = false;
					break;				//有重复则设置为false，不执行下面的if语句
				}
			}
			if(flag) {
				arr1[count] = r;
				System.out.println(arr1[count]);
				count++;
			}
		}
	}
}

