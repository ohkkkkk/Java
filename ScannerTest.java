package test;
/*
 * ���������������е����
 * ��ȡ������
 */
import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("�������һ�����е���ߣ�");
			int height1 = sc.nextInt();
			System.out.println("������ڶ������е���ߣ�");
			int height2 = sc.nextInt();
			System.out.println("��������������е���ߣ�");
			int height3 = sc.nextInt();
			
			int tempHeight = height1 > height2 ? height1 : height2;
			int maxHeight = tempHeight > height3 ? tempHeight : height3;
			
			System.out.println("�����ߵ�ֵΪ��" + maxHeight);
		}
	}

}
