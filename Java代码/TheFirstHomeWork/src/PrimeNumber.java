import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args){

		System.out.println("���������Լ���һ����Χ�ڵ�����");
		System.out.println("�����뷶Χ(�Իس�����):");
		Scanner t1=new Scanner(System.in);
		int num1=t1.nextInt();
		Scanner t2=new Scanner(System.in);
		int num2=t2.nextInt();	
		
		if(num1>=1&num1<num2)
		{        
			System.out.print("�÷�Χ�ڵ�������:");
			for(int i=num1+1;i<=num2;i++) 
			{
	            for(int j=2;j<=(int)Math.sqrt(i);j++)
	            {//��Math.sqrt(i)ת��Ϊint����
	                if(i%j==0)  break;
	                if(j>=(int)Math.sqrt(i)) 
	                {
	                System.out.print(i+" ");
	                }
	            }   
	        }
		}
		else System.out.println("�������������!");
	}
}
