import java.util.Scanner;

class info{
//	public info(){
//	};
	private String name;
	private String ID;
	public void setInfo(String ID,String name){
		this.ID=ID;
		this.name=name;
	}
	
	void show(){
		System.out.println("员工ID:"+ID+"\n"+"姓名："+name);
	}
	
	void modify(){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n请输入想修改的数据");
		System.out.print("员工ID:");		String newID=sc.next(); this.ID=newID;
		System.out.print("姓名:");		String newName=sc.next(); this.name=newName;
		System.out.println("\n修改后的数据为");
		
		show();
	}
	
}


public class Employee{
	public static void main(String[] args){
		info e=new info();
		e.setInfo("2016405A621","Tao");
		e.show();
		e.modify();
	}
}
