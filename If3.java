package test;
/*
 * if语句格式3
 * if（关系表达式）{
 * 		语句体1;
 * }else if（关系表达式2）{
 * 		语句体2;
 * }
 * ......
 * else{
 * 		语句体n + 1;
 * }
 * 执行流程：
 * 1.计算关系表达式1的值
 * 2.值为true执行语句体1，值为false计算关系表达式2的值
 * 3.值为true执行语句体2，值为false计算关系表达式3的值
 * 4......
 * 5.如果没有任何关系表达式值为true，就执行语句体n+1
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
