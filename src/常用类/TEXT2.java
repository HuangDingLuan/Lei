package 常用类;

public class TEXT2 {

	public static void main(String[] args) {
		String s="1,2,3,4,5";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		//String对象与StringBuffer对象互相转换
		sb.append("上山打老虎");
		System.out.println(sb);
		//添加
		sb.delete(0,9);
		System.out.println(sb);
		//删除
		sb.insert(0, "我");
		System.out.println(sb);
		//插入
		System.out.println(sb.reverse());
		//反转
		// TODO Auto-generated method stub

	}

}
