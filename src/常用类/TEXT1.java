package 常用类;

import java.util.Arrays;

public class TEXT1 {

	private static String str = "this is a test of java";

	public static void main(String[] args) {
	test1();
	test2();
	test3();
	}

	public static void test1(){

	int count = 0;
	for (int i = 0; i < str.length(); i++) {
	if('s'==str.charAt(i)){
	count++;
	}
	}

	System.out.println("s出现的次数:"+count);

	}
	public static void test2() {
		int start = str.indexOf("test");
		String s = str.substring(start, start+5);
		System.out.println("取出"+s);
	}
	public static void test3() {
		char[] ch = new char[str.length()];
		for(int i=0; i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
		char[] ch2 = str.toCharArray();
		System.out.println(Arrays.toString(ch2));
	}
}