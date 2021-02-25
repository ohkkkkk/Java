package test;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println("i:" + i);
		
		// += 把左边和右边的数据做加法操作，结果赋值给左边
		i += 20;
		//i = i + 20;
		System.out.println("i:" + i);
		
		//注意：扩展的赋值运算符底层隐含了强制类型转换(转换成int）
		short s = 10;
		s += 20;
		//s = (short)(s + 20)；
		System.out.println("s:" + s);
	}

}
