import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {
	public static void main(String[] args){
		boolean flag=true;
		while(flag){
			int randNumber = new Random().nextInt(10);
			System.out.println("�����������!");
			
			//ʵ������
			System.out.println("----���������µ�����----");
			Scanner sc = new Scanner(System.in);
			int enterNumber = sc.nextInt();
			
			//ʵ�ֱȽ�
			while(enterNumber!=randNumber){
				if(enterNumber>randNumber){
					System.out.println("Sorry�����´��ˣ�");
				}
				else{
					System.out.println("Sorry������С�ˣ�");
				}
	
				System.out.println("----���������µ�����----");
				enterNumber=sc.nextInt();
				}
			System.out.println("��ϲ��������ˣ�\n�Ƿ������(True or flase)");
			Scanner sct = new Scanner(System.in);
			flag = sct.hasNextBoolean();
			if(flag==false) System.out.println("��лʹ�ñ�ϵͳ");
			}
		}
	}

