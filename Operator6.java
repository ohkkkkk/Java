package test;
/*
  三元运算符
  
  格式：
  	关系表达式 ？ 表达式1 : 表达式2；
  	
  	范例：a > b ? a : b;
  	
  	执行流程：
  		先计算关系表达式的值
  		值为true，表达式1的值为运算结果
  		值为false，表达式2的值为运算结果
*/

public class Operator6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		//获取数据中的较大值
		int max = a > b ? a : b;
		System.out.println("max: " + max);
	}

}
