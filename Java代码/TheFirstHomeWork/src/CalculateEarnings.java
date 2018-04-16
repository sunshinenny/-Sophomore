
public class CalculateEarnings {
	public static void main(String[] args) {
		System.out.println("钱精打与郝细算的故事\n两人各存款10000元\n" +
				"钱精打年利率10%\n郝细算年利率5% 有复利");
		double  sum1,sum2;
		sum1=sum2=10000;
		int i=0;
		while(sum1>=sum2)
		{
			sum1=1000+sum1;
			sum2=sum2*0.05+sum2;
			i++;
		}
		System.out.println("郝细算在"+" "+i+" "+"年后 存款超过了钱精打");
	}
}
