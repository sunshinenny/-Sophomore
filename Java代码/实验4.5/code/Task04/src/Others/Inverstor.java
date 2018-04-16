package Others;

public class Inverstor extends Realestate{
	private String[] name=new String[3];
	private float[] money=new float[3];
	
	public Inverstor(String name1,String name2,String name3,float money1,float money2,float money3){
		name[0]=name1;name[1]=name2;name[2]=name3;
		money[0]=money1;money[1]=money2;money[2]=money3;
	}
	public void getProfits(){
		System.out.println(projectName);
		System.out.println("投入"+inverstment+"\n\n包括了以下投资人");
	
		for(int i=0;i<3;i++){
			System.out.println(name[i]+"投资了"+money[i]);
			System.out.println("预计收入可以达到"+money[i]*1.25+"\n");
			sum=(float) (sum+money[i]*1.25);
		}
		gain();
	}
}
