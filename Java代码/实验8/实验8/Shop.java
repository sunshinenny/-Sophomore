/*
 * Goods(类似于结构体)
 * id
 * name
 * num
 * price
 * 
 * new Goods("001",...);
 * new Goods("002",...);
 * 
 * list(看成一个列表)
 * new Goods;
 * new Goods;
 * 
 * Map(看成左右两列列表)
 * 001		3
 * 002		5
 * 
 * 
 * */

import java.util.*;

public class Shop {
	private static Scanner sc;
	private static Map<String, Integer> box;
/*String[] goods1= {"001","洗发水","15","39元"};
	String[] goods2= {"002","笔记本电脑","24","4999元"};
	String[] goods3= {"003","电脑桌","5","199元"};
	String[] goods4= {"004","智能手表","98","799元"};
	String[] goods5= {"005","小米6","∞","2499元"};
	*/
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		box = new HashMap<String, Integer>();
		System.out.println("----------欢迎光临本网站----------");
		// System.out.println("请选择操作:");
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
		// System.out.println("输入错误,请重试");
		//
		// }

	}

	private static void shopList(ArrayList<String> list) {

		list.add("001		洗发水		1432		39元");
		list.add("002		电脑桌		24		199元");
		list.add("003		笔记本电脑	5		4999元");
		list.add("004		智能手表		98		799元");
		list.add("005		小米6		∞		2499元");

		System.out.println("编号		名称		库存数量		单价");
		for (String tem : list) {
			System.out.println(tem);
		}

	}

	static void goShoping(Map<String, Integer> box) {
		System.out.println("\n请输入您要购买的商品编号及数量");

		while (true) {
			String num = sc.next();

			if (num.equals("0")) {
				break;
			} else {
				int nums = sc.nextInt();
				box.put(num, nums);
				System.out.println("添加成功\n请继续添加商品(输入 0 进入购物车):");
				continue;
			}
		}
		System.out.println("	购物车\n" + "编号		购买数量");
		showBox(box);

		System.out.println("\n是否修改内容(y/n)");
		String choice = sc.next();
		switch (choice) {
		case "y":
			changeBox(box);
			break;
		case "n":
			System.out.println("是否需要删除内容(y/n)");
			String choice1 = sc.next();
			switch (choice1) {
			case "y":
				deleteBox(box);
				break;
			case "n":
				System.out.println("是否需要购买(y/n)");
				String choice2 = sc.next();
				switch (choice2) {
				case "y":
					System.out.println("您的商品已整装待发，即刻到达您的手中，欢迎您下次光临");
					break;
				case "n":
					System.out.println("期待您下次光临");
					break;
				default:
					System.out.println("输入错误，请重试");
				}
				;
				break;
			default:
				System.out.println("输入错误，请重试");
			}
			;
			break;

		default:
			System.out.println("输入错误，请重试");
		}
	}

	static void changeBox(Map<String, Integer> box) {
		System.out.println("请输入要修改的商品编号，以及新的购买数量(以空格隔开)");
		String newKey = sc.next();
		int newNum = sc.nextInt();
		if (box.get(newKey) != null) {
			box.put(newKey, newNum);
			System.out.println("	购物车\n" + "编号		购买数量");
			showBox(box);
		} else
			System.out.println("该商品不存在");
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
