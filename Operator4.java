package test;

public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int k = 30;
		
		//&（与） 有false则false
		System.out.println((i < j) & (i > k));//false
		System.out.println("-------------");
		
		//|（或） 有true则ture
		System.out.println((i < j) | (i > k));//ture
		System.out.println(("-------------"));
		
		//^（异或） 相同为false，不同为ture
		System.out.println((i < j) ^ (i > k));//ture
		System.out.println(("-------------"));
		
		//！（非）
		System.out.println(!(i < j));//输出为false
		
	}

}
