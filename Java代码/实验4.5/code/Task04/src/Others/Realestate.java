package Others;

public class Realestate implements IGain{
	protected String projectName="种植园管理项目";
	protected float inverstment=55000;
	float sum=0;


	
	public void gain() {
		System.out.println("预计公司总收入可达到:"+sum);
	}
}
