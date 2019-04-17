package 常用类;

public class TEXT3 {

	public static void main(String[] args) {
		int s=3169;
		Integer a=new Integer(1348);
		String str=new String("3766");
		
		Integer b=new Integer(s);
		//基本数据类型转化为包装类
		
		int s1=a.intValue();
		//包装类转化基本数据类型
		Integer c=Integer.valueOf(str);
		//字符串转化包装类
		String str1=a.toString();
		String str2=String.valueOf(a);
		//包装类转化字符串
		String str3=Integer.toString(s);//方法一
		String str4=String.valueOf(s);//方法二
		String str5=s+" ";	//方法1三
		//基本数据类型转化字符串
	}
		// TODO Auto-generated method stub
	}

