package test;

public class Operator5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int k = 30;
		
		//|| 有true则true(如左边为假，右边执行；左边为真，右边不执行）
		System.out.println((i < j) || (i > k));
		System.out.println("-------------");
		
		//&& 有false则false
		System.out.println((i < j) && (i > k));//false
		System.out.println("-------------");
		
		//||（或） 有true则ture
		System.out.println((i < j) | (i > k));//ture
		System.out.println(("-------------"));
		
		//&&和&
		System.out.println((i++ > 100) && (j++ > 100)); //false & false(因为第一个为false，所以短路，不继续执行下一步j++)
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		
	}

}
