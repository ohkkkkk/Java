package test;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a month number:");
		int month = sc.nextInt();
		//case´©Í¸
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("autumn");
			break;
		default:
			System.out.println("Your input is wrong!");
		}
	}

}
