package test;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of even numbers from 1-100:" + sum);
	}

}
