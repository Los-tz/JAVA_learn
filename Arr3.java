import java.util.Scanner;

public class Arr3 {
	public static void main(String[] args) {
		Scanner stu = new Scanner(System.in);
/*		
		System.out.println("����");
		String name = stu.next();
		System.out.println(name);
		
		System.out.println("���Ƴɼ�");
		int score = stu.nextInt();
		System.out.println(score);

		System.out.println("ƽ����");
		double average = stu.nextDouble();
		System.out.println(average);			//scanner�﷨��ϰ
*/
		System.out.println("ѧ������");
		int num = stu.nextInt();
		int[] score = new int[num];
		System.out.println("����"+ num + "���ɼ�");
		for(int i = 0; i<num; i++) {
			score[i] = stu.nextInt();
		}
		
		int max = 0;
		for(int i = 0; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}
		}
			char level;
			for(int j = 0; j<score.length; j++) {
				if(max - score[j] <= 10) {
					level = 'A';
				}else if(max - score[j] <= 20) {
					level = 'B';
				}else  if(max - score[j] <= 30) {
					level = 'B';
				}else {
					level = 'D';
				}
				System.out.println("student " + j + " score is "+ score[j] + ", is" + level);
			}
		stu.close();
	}
}
