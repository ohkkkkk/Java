package test;
/*
 * switch���
 * switch(���ʽ){
 * case ֵ1:
 * �����1;
 * break;
 * case ֵ2:
 * �����2;
 * break;
 * ......
 * default:
 * �����n+1;
 * [break;]
 * }
 * 
 * ��ʽ˵����
 * 		���ʽ��ȡֵΪbyte��short��int��char����JDK5�Ժ������ö�٣�JDK7�Ժ������String��
 * 		case�����������Ҫ�ͱ��ʽ���бȽϵ�ֵ��
 * 		break����ʾ�жϣ���������˼����������switch��䡣
 * 		default����ʾ�����������ƥ���ʱ�򣬾�ִ�иô������ݣ���if����else���ơ�
 * 
 * ִ�����̣�
 * 		���ȼ�����ʽ��ֵ
 * 		���κ�case�����ֵ�Ƚϣ�����ж�Ӧ��ֵ���ͻ�ִ����Ӧ����䣬��ִ�еĹ����У�����break�ͻ����
 * 		�����������case�����ֵ�ͱ��ʽ��ֵ����ƥ�䣬�ͻ�ִ��default���������壬Ȼ��������
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
			System.out.println("Your input is wrong��");
		}
		System.out.println("-----end-----");
		
	}

}
