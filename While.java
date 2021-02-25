package test;
/*
 * while语句
 * 		while（条件判断语句）{
 * 			循环体语句;
 * 		}
 * 
 * 完整格式:
 * 		初始化语句;
 * 		while（条件判断语句）{
 * 			循环体语句;
 * 			条件控制语句;
 * 		}
 * 执行流程:
 * 		1.执行初始化语句
 * 		2.执行条件判断语句，看其结果是true还是false
 * 			结果为true，继续执行
 * 			结果为false，循环结束
 * 		3.执行循环体语句
 * 		4.执行条件控制语句
 * 		5.回到2继续
 */
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1; j<=5; j++) {
			System.out.println("HelloWorld!");
		}
		
		int i=1;
		while(i<=5) {
			System.out.println("Hello World!");
			i++;
		}
	}

}
