package test;

/*
 * for语句
 * for（初始化语句;条件判断语句;条件控制语句）{
 * 		循环体语句;
 * }
 * 
 * 执行流程:
 * 1.执行初始化语句
 * 2.执行条件判断语句，判断结果是true还是false
 * 		如果是true，继续执行
 * 		如果是false，循环结束
 * 3.执行循环语句
 * 4.执行条件控制语句
 * 5.回到2继续
 */
public class For {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.println("HelloWorld!");
		}
	}
}
