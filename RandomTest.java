package test;

import java.util.Random;
import java.util.Scanner;
public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number you guess:");
		int guessNumber = sc.nextInt();
		
		if(guessNumber > number) {
			System.out.println("Your guess number is big!");
		}else if(guessNumber < number){
			System.out.println("Your guess number is small!");
		}else {
			System.out.println("Correct!");
			break;
		}
	}
	}

}
