package Other.company;

import Other.ad;

public class companys implements ad{
	String name,content;
	int time;
	public void show(String name,String content,int time) {
		System.out.println("��˾����"+name);
		System.out.println("������ݣ�"+content);
		System.out.println("ʱ�䣺"+time+"��\n");
	}
}
