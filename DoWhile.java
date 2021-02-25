package test;
/*
 * do...while语句
 * 		初始化语句;
 * 		do{
 * 			循环体语句;
 * 			条件控制语句;
 * 		}while(条件判断语句);
 * 
 * 执行流程:
 * 		1.执行初始化语句
 * 		2.执行循环体语句
 * 		3.执行条件控制语句
 * 		4.执行条件判断语句，判断结果为true还是false
 * 			结果为true，继续执行
 * 			结果为false，结束循环
 * 		5.回到2继续
 */
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			System.out.println("HelloWorld!");
		}
		System.out.println("----------");
		int j=1;
		while(j<=5) {
			System.out.println("Hello World!");
			j++;
		}
		System.out.println("----------");
		int k=1;
		do {
			System.out.println("hello world!");
			k++;
		}while(k<=5);
	}

}
