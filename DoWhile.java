package test;
/*
 * do...while���
 * 		��ʼ�����;
 * 		do{
 * 			ѭ�������;
 * 			�����������;
 * 		}while(�����ж����);
 * 
 * ִ������:
 * 		1.ִ�г�ʼ�����
 * 		2.ִ��ѭ�������
 * 		3.ִ�������������
 * 		4.ִ�������ж���䣬�жϽ��Ϊtrue����false
 * 			���Ϊtrue������ִ��
 * 			���Ϊfalse������ѭ��
 * 		5.�ص�2����
 */
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			System.out.println("HelloWorld!");
		}
		System.out.println("----------");
		int j=1;
		while(j<=5) {
			System.out.println("Hello World!");
			j++;
		}
		System.out.println("----------");
		int k=1;
		do {
			System.out.println("hello world!");
			k++;
		}while(k<=5);
	}

}
