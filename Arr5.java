import java.util.Random;

public class Arr5 {
	public static void main(String[] args) {
		int[] arr1 = new int[6];
		Random rand = new Random();
		int count = 0;
		while(count < arr1.length) {
			boolean flag = true;		//�ж�������Ƿ��ظ��ı�־
			int r = rand.nextInt(29)+1;
			for(int i = 0; i < arr1.length; i++) {
				if(r == arr1[i]) {		//�Ƚ������������������Ƿ��ظ�
					flag = false;
					break;				//���ظ�������Ϊfalse����ִ�������if���
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

