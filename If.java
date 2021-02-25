package test;
/*
 * if语句格式1
 * if（关系表达式）{
 * 		语句体;
 * }
 * 执行流程：
 * 1.计算关系表达式的值
 * 2.如值为true，执行语句体
 * 3.如值为false，不执行
 * 4.继续执行语句后的内容
 */
public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始");
		
		int a = 10;
		int b =20;
		
		if(a == b){
			System.out.println("a等于b");
		}
		
		int c = 10;
		if(a == c) {
			System.out.println("a等于c");
		}
		System.out.println("结束");
	}

}
