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
		System.out.println("Ա��ID:"+ID+"\n"+"������"+name);
	}
	
	void modify(){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n���������޸ĵ�����");
		System.out.print("Ա��ID:");		String newID=sc.next(); this.ID=newID;
		System.out.print("����:");		String newName=sc.next(); this.name=newName;
		System.out.println("\n�޸ĺ������Ϊ");
		
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
