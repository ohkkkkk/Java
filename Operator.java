package test;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		char c ='A'; //'A'��ֵ��65
		c = 'a';  // 'a'��ֵ��97
		c = '0'; //'0'��ֵ��48
		System.out.println(i + c);
		
		//char ch = i +c;
		//char���ͻ��Զ�������Ϊint����
		int j = i + c;
		System.out.println(j);
		
		//int k = 10 + 13.14;
		double d = 10 + 13.14;
	}

}
