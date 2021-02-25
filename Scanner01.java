package test;
import java.util.Scanner;
public class Scanner01 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//创建对象
		Scanner sc = new Scanner(System.in)) {
			//接收数据
			int x = sc.nextInt();
			
			//输出数据
			System.out.println("x:" + x);
		}
	}

}
