package test;
/*
 * switch语句
 * switch(表达式){
 * case 值1:
 * 语句体1;
 * break;
 * case 值2:
 * 语句体2;
 * break;
 * ......
 * default:
 * 语句体n+1;
 * [break;]
 * }
 * 
 * 格式说明：
 * 		表达式：取值为byte、short、int、char、，JDK5以后可以是枚举，JDK7以后可以是String。
 * 		case：后面跟的是要和表达式进行比较的值。
 * 		break：表示中断，结束的意思，用来结束switch语句。
 * 		default：表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
 * 
 * 执行流程：
 * 		首先计算表达式的值
 * 		依次和case后面的值比较，如果有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束
 * 		如果后面所有case后面的值和表达式的值都不匹配，就会执行default里面的语句体，然后程序结束
 */

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.println("-----Start-----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a week number:");
		int week = sc.nextInt();
		
		switch(week) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;	
		default:
			System.out.println("Your input is wrong！");
		}
		System.out.println("-----end-----");
		
	}

}
