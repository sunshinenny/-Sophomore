package Other.company;

import Other.ad;

public class companys implements ad{
	String name,content;
	int time;
	public void show(String name,String content,int time) {
		System.out.println("公司名："+name);
		System.out.println("广告内容："+content);
		System.out.println("时间："+time+"天\n");
	}
}
