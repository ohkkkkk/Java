package test;
/*
  ��Ԫ�����
  
  ��ʽ��
  	��ϵ���ʽ �� ���ʽ1 : ���ʽ2��
  	
  	������a > b ? a : b;
  	
  	ִ�����̣�
  		�ȼ����ϵ���ʽ��ֵ
  		ֵΪtrue�����ʽ1��ֵΪ������
  		ֵΪfalse�����ʽ2��ֵΪ������
*/

public class Operator6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		//��ȡ�����еĽϴ�ֵ
		int max = a > b ? a : b;
		System.out.println("max: " + max);
	}

}
