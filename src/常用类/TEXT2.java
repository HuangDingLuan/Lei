package ������;

public class TEXT2 {

	public static void main(String[] args) {
		String s="1,2,3,4,5";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		//String������StringBuffer������ת��
		sb.append("��ɽ���ϻ�");
		System.out.println(sb);
		//���
		sb.delete(0,9);
		System.out.println(sb);
		//ɾ��
		sb.insert(0, "��");
		System.out.println(sb);
		//����
		System.out.println(sb.reverse());
		//��ת
		// TODO Auto-generated method stub

	}

}
