package test;

public class Operator5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int k = 30;
		
		//|| ��true��true(�����Ϊ�٣��ұ�ִ�У����Ϊ�棬�ұ߲�ִ�У�
		System.out.println((i < j) || (i > k));
		System.out.println("-------------");
		
		//&& ��false��false
		System.out.println((i < j) && (i > k));//false
		System.out.println("-------------");
		
		//||���� ��true��ture
		System.out.println((i < j) | (i > k));//ture
		System.out.println(("-------------"));
		
		//&&��&
		System.out.println((i++ > 100) && (j++ > 100)); //false & false(��Ϊ��һ��Ϊfalse�����Զ�·��������ִ����һ��j++)
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		
	}

}
