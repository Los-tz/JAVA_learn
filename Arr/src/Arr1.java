
public class Arr1 {
	public static void main(String[] args) {
	int[] a = new int[] {10,20};	//��̬�����ʼ��
	String[] b = new String[2];	//��̬�����ʼ��
	
	b[0] = "10";
	b[1] = "20";	//����Ǳ����
	
	System.out.println(a.length);
	System.out.println(b.length);	//�����鳤��
	
	for(int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}	//��������
	
	int[] arr1 = new int[3];
	for(int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}	//��������Ĭ�ϳ�ʼ����0
	
	System.out.println("---------");
	float[] arr2 = new float[3];
	for(int i = 0; i < arr2.length; i++) {
		System.out.println(arr2[i]);
	}	//����������Ĭ�ϳ�ʼ����0.0
	
	System.out.println("-------");
	char[] arr3 = new char[3];
	for(int i = 0; i < arr3.length; i++) {
		System.out.println(arr3[i]);
	}
	if(0 == arr3[1]) {
		System.out.println("�ַ�������Ĭ�ϳ�ʼ����0 '0'");
	}

	System.out.println("-------");
	boolean[] arr4 = new boolean[3];
	System.out.println(arr4[2]);	//����������Ĭ�ϳ�ʼ����false
	
	System.out.println("-------");
	String[] arr5 = new String[4];
	System.out.println(arr5[2]);	//����Ԫ���������������͵�Ĭ�ϳ�ʼ���� null
	}
}
