package test;
/*
 * 三个和尚的身高为150cm、210cm、165cm
 * 获取最高身高
 */
public class OperatorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height1 = 150;
		int height2 = 210;
		int height3 = 165;
		int tempHeight = height1 > height2 ? height1 : height2;
		int maxHeight = tempHeight > height3 ? tempHeight : height3;
		System.out.println(maxHeight);
	}

}
