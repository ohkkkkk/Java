/*
ʹ�ñ�����ʱ����һЩע�����

1.������������������ô����֮������Ʋ������ظ���
2.����float��long������˵����ĸ��׺F��L��Ҫ������
3.���ʹ��byte����short���͵ı�������ô�Ҳ������ֵ���ܳ���������͵ķ�Χ��
4.�����򣺴Ӷ��������һ�п�ʼ��һֱ��ֱ�������Ĵ����Ž���Ϊֹ��
*/
public class Demo03VariableNotice{
	public static void main(String[] args){
		int num1 = 10;//������һ���µı���
		//num1 = 20; //�ִ�������һ���µı���������Ҳ��num1������
		
		int num2 = 20;
		
		int num3;
		num3 = 30;
		
		int num4;//������һ������������û�и�ֵ
		//System.out.println(num4);//ֱ��ʹ�ô�ӡ����Ǵ���ģ�
		
		{
			int num5 = 500;
			System.out.println(num5);
		}
		//System.out.println(num5);//�Ѿ������˴����ŷ�Χ�������������򣬱���������ʹ��
		//num5 = 500//����ʹ��num5����
		
		int a, b, c;//ͬʱ������������int���͵ı���
		//���Էֱ�ֵ
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//ͬʱ��������int����������ͬʱ���Ը�ֵ
		int x = 100, y = 200, z = 300;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}