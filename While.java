package test;
/*
 * while���
 * 		while�������ж���䣩{
 * 			ѭ�������;
 * 		}
 * 
 * ������ʽ:
 * 		��ʼ�����;
 * 		while�������ж���䣩{
 * 			ѭ�������;
 * 			�����������;
 * 		}
 * ִ������:
 * 		1.ִ�г�ʼ�����
 * 		2.ִ�������ж���䣬��������true����false
 * 			���Ϊtrue������ִ��
 * 			���Ϊfalse��ѭ������
 * 		3.ִ��ѭ�������
 * 		4.ִ�������������
 * 		5.�ص�2����
 */
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1; j<=5; j++) {
			System.out.println("HelloWorld!");
		}
		
		int i=1;
		while(i<=5) {
			System.out.println("Hello World!");
			i++;
		}
	}

}
