package test;
/*
 * Random:����һ�������
 * 
 * ʹ�ò��裺
 * 	1.����
 * 		import Java.util.Random;
 *  2.��������
 *  	Random r = new Random();
 *  3.��ȡ�����
 *  	int number = r.nextInt(10);
 *  	��ȡ���ݷ�Χ:[0,10)����0��������10
 */

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		for(int i=0; i<10; i++) {
			int number = r.nextInt(10);
			System.out.println(number);
		}
		
		//��ȡһ��1-100֮��������
		int x = r.nextInt(100) + 1;
		System.out.println(x);
	}

}
