import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args){

		System.out.println("本程序用以计算一定范围内的素数");
		System.out.println("请输入范围(以回车隔开):");
		Scanner t1=new Scanner(System.in);
		int num1=t1.nextInt();
		Scanner t2=new Scanner(System.in);
		int num2=t2.nextInt();	
		
		if(num1>=1&num1<num2)
		{        
			System.out.print("该范围内的素数有:");
			for(int i=num1+1;i<=num2;i++) 
			{
	            for(int j=2;j<=(int)Math.sqrt(i);j++)
	            {//把Math.sqrt(i)转换为int类形
	                if(i%j==0)  break;
	                if(j>=(int)Math.sqrt(i)) 
	                {
	                System.out.print(i+" ");
	                }
	            }   
	        }
		}
		else System.out.println("输入错误，请重试!");
	}
}
