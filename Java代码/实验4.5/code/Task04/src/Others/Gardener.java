package Others;


public class Gardener extends Fruit{
//有空改成循环赋值
	private String name1,name2,name3;
	private float num1,num2,num3;
	public Gardener(String name1,String name2,String name3, 
			float num1,float num2,float num3) {
		super(name1, name2, name3, num1, num2, num3);
		this.name1=name1;this.name2=name2;this.name3=name3;
		this.num1=num1;this.num2=num2;this.num3=num3;
	}
	
	public void plant(){
		grow(this.name1);harvest(this.name1,this.num1);
		grow(this.name2);harvest(this.name2,this.num2);
		grow(this.name3);harvest(this.name3,this.num3);
		gain();
	}
}
	