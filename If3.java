package test;
/*
 * if����ʽ3
 * if����ϵ���ʽ��{
 * 		�����1;
 * }else if����ϵ���ʽ2��{
 * 		�����2;
 * }
 * ......
 * else{
 * 		�����n + 1;
 * }
 * ִ�����̣�
 * 1.�����ϵ���ʽ1��ֵ
 * 2.ֵΪtrueִ�������1��ֵΪfalse�����ϵ���ʽ2��ֵ
 * 3.ֵΪtrueִ�������2��ֵΪfalse�����ϵ���ʽ3��ֵ
 * 4......
 * 5.���û���κι�ϵ���ʽֵΪtrue����ִ�������n+1
 */

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----start-----");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a weekday(1-7):");
		int week = sc.nextInt();
		
		if(week == 1) {
			System.out.println("Monday");
		}else if(week == 2) {
			System.out.println("Tuesday");
		}else if(week == 3) {
			System.out.println("Wednesday");
		}else if(week == 4) {
			System.out.println("Thursday");
		}else if(week == 5) {
			System.out.println("Friday");
		}else if(week == 6) {
			System.out.println("Saturday");
		}else if(week == 7) {
			System.out.println("Sunday");
		}
		
		System.out.println("-----end-----");
	}

}
