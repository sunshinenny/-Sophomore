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
		System.out.println("员工ID："+ID+"\n"+"姓名："+name);
	}
	
	void modify(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入想修改的数据");
		System.out.print("ID:");		int newID=sc.nextInt(); this.ID=newID;
		System.out.print("姓名:");		java.lang.String newName=sc.next(); this.name=newName;
		System.out.println("修改后的数据为");
		
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
