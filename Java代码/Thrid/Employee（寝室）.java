import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.String;

class info{
//	public info(){
//	};
	private java.lang.String name;
	private int ID;
	public void setInfo(int ID,java.lang.String name){
		this.ID=ID;
		this.name=name;
	}
	
	void show(){
		System.out.println("Ա��ID��"+ID+"\n"+"������"+name);
	}
	
	void modify(){
		Scanner sc=new Scanner(System.in);
		System.out.println("���������޸ĵ�����");
		System.out.print("ID:");		int newID=sc.nextInt(); this.ID=newID;
		System.out.print("����:");		java.lang.String newName=sc.next(); this.name=newName;
		System.out.println("�޸ĺ������Ϊ");
		
		show();
	}
	
}


public class Employee{
	public static void main(String[] args){
		info e=new info();
		e.setInfo(2016405,"Tao");
		e.show();
		e.modify();
	}
}
