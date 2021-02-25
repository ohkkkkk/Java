package test;
/*
 *奇偶数
 *给出任意一个数，判断是奇数还是偶数
 */
import java.util.Scanner;
public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is even");
		}else {
			System.out.println(num + " is odd");
		}
		
	}

}
