package test;

public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int k = 30;
		
		//&���룩 ��false��false
		System.out.println((i < j) & (i > k));//false
		System.out.println("-------------");
		
		//|���� ��true��ture
		System.out.println((i < j) | (i > k));//ture
		System.out.println(("-------------"));
		
		//^����� ��ͬΪfalse����ͬΪture
		System.out.println((i < j) ^ (i > k));//ture
		System.out.println(("-------------"));
		
		//�����ǣ�
		System.out.println(!(i < j));//���Ϊfalse
		
	}

}
