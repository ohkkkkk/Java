package test;
/*
 * if语句格式2
 * if（关系表达式）{
 * 		语句体1;
 * }else {
 * 		语句体2：
 * }
 * 
 * 执行流程：
 * 1.计算关系表达式的值
 * 2.值为true，执行语句体1
 * 3.值为false，执行语句体2
 * 4.继续执行后面的语句内容
 */

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		int a = 10;
		int b = 20;
		
		if(a>b) {
			System.out.println("a is bigger than b");
		}else {
			System.out.println("a is not bigger than b");
		}
		System.out.println("end");
	}

}
