package Others;


public class Fruit implements IGain,IPlant{
	private String[] fruitName=new String[3];
	private float[] investment=new float[3];
	float sum=0;
	//构造函数初始化
	public Fruit(String name1,String name2,String name3,float num1,float num2,float num3){
		fruitName[0]=name1;fruitName[1]=name2;fruitName[2]=name3;
		investment[0]=num1;investment[1]=num2;investment[2]=num3;
	}
	
	public void gain() {
			System.out.println("预计总收入为:"+sum);
	}

	public void grow(String name1) {
		System.out.println(name1+"正在茁壮成长");
	}

	public void harvest(String name2,float num) {
		System.out.println("预计收入为:"+num*1.5+"\n");
		sum=(float) (sum+num*1.5);
	}
}
