package test;
/*
 * ֽ�ź��Ϊ0.1���ף����������߶�Ϊ8844430����
 * ֽ��Ҫ�۵����ٴβ��ܺ����������һ����
 */
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double paper = 0.1;
		int count = 0;
		int height = 8844430;
		while(paper < height) {
			paper *= 2;
			count++;
		}
		System.out.println(count);
	}

}
