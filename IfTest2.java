package test;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your score:");
		
		int score = sc.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("The score your enter is wrong!");
		}else if(score >= 95 && score <= 100) {
			System.out.println("You can get a bicycle!");
		}else if(score <95 && score >=90){
			System.out.println("You can go to the amusement park!");
		}else if(score <90 && score >=80){
			System.out.println("You can get a toy!");
		}else {
			System.out.println("You have to hand in your pocket money");
		}
	}

}
