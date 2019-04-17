package 常用类;

import java.util.Arrays;

public class TEXT1 {

	private static String str = "this is a test of java";

	public static void main(String[] args) {
	test1();
	test2();
	test3();
	test4();
	test5();
	test6();
	test7();
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
		System.out.println("取出："+s);
	}
	public static void test3() {
		char[] c2=str.toCharArray();
		for (int i = 0; i < c2.length; i++) {
            System.out.print(c2[i]);
        }
        System.out.println();
	}
	public static void test4() {
		String[] s1=str.split(" ");
		for (int i = 0; i < s1.length; i++) {
		String s2 = s1[i].substring(0,1).toUpperCase()+s1[i].substring(1);

		System.out.println(s2+" ");
		}
	}
	
	public static void test5() {
		StringBuffer s3= new StringBuffer(str);
		System.out.println(s3.reverse().toString());
		
		}
	public static void test6() {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");	
	}
	public static void test7() {
        String[] s4=str.split("");
        System.out.println(Arrays.deepToString(s4));

	}
}


 
		
	