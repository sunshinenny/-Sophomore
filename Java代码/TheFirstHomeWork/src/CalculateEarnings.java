
public class CalculateEarnings {
	public static void main(String[] args) {
		System.out.println("Ǯ�������ϸ��Ĺ���\n���˸����10000Ԫ\n" +
				"Ǯ����������10%\n��ϸ��������5% �и���");
		double  sum1,sum2;
		sum1=sum2=10000;
		int i=0;
		while(sum1>=sum2)
		{
			sum1=1000+sum1;
			sum2=sum2*0.05+sum2;
			i++;
		}
		System.out.println("��ϸ����"+" "+i+" "+"��� ������Ǯ����");
	}
}
