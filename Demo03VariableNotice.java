/*
使用变量的时候，有一些注意事项：

1.如果创建多个变量，那么变量之间的名称不可以重复。
2.对于float和long类型来说，字母后缀F和L不要丢掉。
3.如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围。
4.作用域：从定义变量的一行开始，一直到直接所属的大括号结束为止。
*/
public class Demo03VariableNotice{
	public static void main(String[] args){
		int num1 = 10;//创建了一个新的变量
		//num1 = 20; //又创建了另一个新的变量，名字也叫num1，错误！
		
		int num2 = 20;
		
		int num3;
		num3 = 30;
		
		int num4;//定义了一个变量，但是没有赋值
		//System.out.println(num4);//直接使用打印输出是错误的！
		
		{
			int num5 = 500;
			System.out.println(num5);
		}
		//System.out.println(num5);//已经超出了大括号范围，超出了作用域，变量不能再使用
		//num5 = 500//可再使用num5定义
		
		int a, b, c;//同时创建三个都是int类型的变量
		//各自分别赋值
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//同时创建三个int变量，并且同时各自赋值
		int x = 100, y = 200, z = 300;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}