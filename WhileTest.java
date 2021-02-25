package test;
/*
 * 纸张厚度为0.1毫米，珠穆朗玛峰高度为8844430毫米
 * 纸张要折叠多少次才能和珠穆朗玛峰一样高
 */
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double paper = 0.1;
		int count = 0;
		int height = 8844430;
		while(paper < height) {
			paper *= 2;
			count++;
		}
		System.out.println(count);
	}

}
