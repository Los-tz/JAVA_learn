
public class Eg {
	public static void main(String[] args) {
			
//数瓶子
		int beerNum = 99;
		String word = "bottles";
		
		while(beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";			//单数的瓶子
			}
			System.out.println(beerNum + " " + word + " " + "of beer on the wall");
			System.out.println(beerNum + " " + word + " " + "of beer.");
			System.out.println("Take one down.");
			System.out.println("pass it around");
			beerNum = beerNum -1;
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " " + "of beer on the wall");			
			}else {
				System.out.println("No more bottles of beer on the wall");
			}//else结束
		}//while结束
	}//main方法结束
}//class结束
//n的阶乘
/*	public static void main(String[] args) {
	int N = 5;
	int i = N;
	int result = 1;
	System.out.printf("5!=");
	for(i=N;i>1;i--) {
		result *= i;
		System.out.print(i + "*");
		}
	System.out.print("1" + "=" + result);
	}
}*/
