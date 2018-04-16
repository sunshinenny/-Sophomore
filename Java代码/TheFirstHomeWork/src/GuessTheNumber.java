import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {
	public static void main(String[] args){
		boolean flag=true;
		while(flag){
			int randNumber = new Random().nextInt(10);
			System.out.println("随机数已生成!");
			
			//实现输入
			System.out.println("----请输入您猜的数字----");
			Scanner sc = new Scanner(System.in);
			int enterNumber = sc.nextInt();
			
			//实现比较
			while(enterNumber!=randNumber){
				if(enterNumber>randNumber){
					System.out.println("Sorry，您猜大了！");
				}
				else{
					System.out.println("Sorry，您猜小了！");
				}
	
				System.out.println("----请输入您猜的数字----");
				enterNumber=sc.nextInt();
				}
			System.out.println("恭喜您，答对了！\n是否继续？(True or flase)");
			Scanner sct = new Scanner(System.in);
			flag = sct.hasNextBoolean();
			if(flag==false) System.out.println("感谢使用本系统");
			}
		}
	}

