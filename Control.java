package test;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			if(i%2 == 0) {
				continue;
				//break;
			}
			System.out.println(i);
		}
	}

}
