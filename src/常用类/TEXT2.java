package 常用类;

public class TEXT2 {

	public static void main(String[] args) {
		String s="1,2,3,4,5";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		//String对象与StringBuffer对象互相转换
		sb.append("上山打老虎");
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
