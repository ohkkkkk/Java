package test;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println("i:" + i);
		
		//����ʹ�ý��һ���������÷���
		//i++
		//++i
		System.out.println("i:" + i);
		
		//�������ʹ��
		//int j = i++; //�Ȱ�i��ֵ��j���� i+1
		//System.out.println("i:" + i);
		//System.out.println("j:" + j);
		int j = ++i; //��i+1,�ٸ�ֵ��j
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		
	}

}
