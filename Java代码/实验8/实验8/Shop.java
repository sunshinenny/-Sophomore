/*
 * Goods(�����ڽṹ��)
 * id
 * name
 * num
 * price
 * 
 * new Goods("001",...);
 * new Goods("002",...);
 * 
 * list(����һ���б�)
 * new Goods;
 * new Goods;
 * 
 * Map(�������������б�)
 * 001		3
 * 002		5
 * 
 * 
 * */

import java.util.*;

public class Shop {
	private static Scanner sc;
	private static Map<String, Integer> box;
/*String[] goods1= {"001","ϴ��ˮ","15","39Ԫ"};
	String[] goods2= {"002","�ʼǱ�����","24","4999Ԫ"};
	String[] goods3= {"003","������","5","199Ԫ"};
	String[] goods4= {"004","�����ֱ�","98","799Ԫ"};
	String[] goods5= {"005","С��6","��","2499Ԫ"};
	*/
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		box = new HashMap<String, Integer>();
		System.out.println("----------��ӭ���ٱ���վ----------");
		// System.out.println("��ѡ�����:");
		sc = new Scanner(System.in);
		// int choice = sc.nextInt();
		// switch (choice) {
		// case 1:
		shopList(list);
		goShoping(box);
		// break;
		// case 2:
		// ;
		// break;
		// case 3:
		// ;
		// break;
		// default:
		// System.out.println("�������,������");
		//
		// }

	}

	private static void shopList(ArrayList<String> list) {

		list.add("001		ϴ��ˮ		1432		39Ԫ");
		list.add("002		������		24		199Ԫ");
		list.add("003		�ʼǱ�����	5		4999Ԫ");
		list.add("004		�����ֱ�		98		799Ԫ");
		list.add("005		С��6		��		2499Ԫ");

		System.out.println("���		����		�������		����");
		for (String tem : list) {
			System.out.println(tem);
		}

	}

	static void goShoping(Map<String, Integer> box) {
		System.out.println("\n��������Ҫ�������Ʒ��ż�����");

		while (true) {
			String num = sc.next();

			if (num.equals("0")) {
				break;
			} else {
				int nums = sc.nextInt();
				box.put(num, nums);
				System.out.println("��ӳɹ�\n����������Ʒ(���� 0 ���빺�ﳵ):");
				continue;
			}
		}
		System.out.println("	���ﳵ\n" + "���		��������");
		showBox(box);

		System.out.println("\n�Ƿ��޸�����(y/n)");
		String choice = sc.next();
		switch (choice) {
		case "y":
			changeBox(box);
			break;
		case "n":
			System.out.println("�Ƿ���Ҫɾ������(y/n)");
			String choice1 = sc.next();
			switch (choice1) {
			case "y":
				deleteBox(box);
				break;
			case "n":
				System.out.println("�Ƿ���Ҫ����(y/n)");
				String choice2 = sc.next();
				switch (choice2) {
				case "y":
					System.out.println("������Ʒ����װ���������̵����������У���ӭ���´ι���");
					break;
				case "n":
					System.out.println("�ڴ����´ι���");
					break;
				default:
					System.out.println("�������������");
				}
				;
				break;
			default:
				System.out.println("�������������");
			}
			;
			break;

		default:
			System.out.println("�������������");
		}
	}

	static void changeBox(Map<String, Integer> box) {
		System.out.println("������Ҫ�޸ĵ���Ʒ��ţ��Լ��µĹ�������(�Կո����)");
		String newKey = sc.next();
		int newNum = sc.nextInt();
		if (box.get(newKey) != null) {
			box.put(newKey, newNum);
			System.out.println("	���ﳵ\n" + "���		��������");
			showBox(box);
		} else
			System.out.println("����Ʒ������");
	}

	static void deleteBox(Map<String, Integer> box) {

	}
	
	static void showBox(Map<String, Integer> box) {
		Set<String> keySet = box.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			Object key = it.next();
			Object value = box.get(key);
			System.out.println(key + "		" + value);
		}
	}
}
