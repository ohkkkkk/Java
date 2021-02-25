package test;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println("i:" + i);
		
		//单独使用结果一样（常见用法）
		//i++
		//++i
		System.out.println("i:" + i);
		
		//参与操作使用
		//int j = i++; //先把i赋值给j，再 i+1
		//System.out.println("i:" + i);
		//System.out.println("j:" + j);
		int j = ++i; //先i+1,再赋值给j
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		
	}

}
