package test;
/*
 * 水仙花数个数
 */
public class ForTest5 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=100; i<1000; i++) {
			int a = i%10;
			int b = i/10%10;
			int c = i/100%10;
			if(a*a*a + b*b*b + c*c*c == i) {
				count++;
			}
		}
		System.out.println(count);
	}
}
