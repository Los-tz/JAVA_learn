
public class Eg {
	public static void main(String[] args) {
	}
	}
		/*
		//你可以随意加上其他术语
		String[] wordListOne = {"24/7","multiTier","30,3000 foot","B-to-B","win-win","fromy-end",
								"web-based","pervasive","smart","six-sigma","critical-path",
								"dynamic"};
		String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric",
								"distributed","clustered","branded","ouotside-the-box",
								"positioned","networked","focused","leveraged","aligned",
								"targeted","shared","cooperative","accelerated"};
		String[] wordListThree = {"process","tipping-point","solution","architecture", 
								"core competency","strategy","mindshare","portal","space",
								"vision","paradigm",",ission"};
		//计算每一组有多少个名词术语
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		//产生随机数字
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		//组合出专家术语
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		//输出
		System.out.println("what we need is a " + phrase);
	}
}
//数瓶子
/*		int beerNum = 99;
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
