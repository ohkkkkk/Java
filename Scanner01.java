package test;
import java.util.Scanner;
public class Scanner01 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//��������
		Scanner sc = new Scanner(System.in)) {
			//��������
			int x = sc.nextInt();
			
			//�������
			System.out.println("x:" + x);
		}
	}

}
