package Test;
import Others.Gardener;
import Others.Inverstor;

public class test {
	public static void main(String[] args){
		//Fruit f=new Fruit("ƻ�� ","�� ","�㽶 ",30000,10000,15000);
		Gardener gar=new Gardener("ƻ�� ","�� ","�㽶 ",30000,10000,15000);
		Inverstor inv=new Inverstor("Sunny","SunShine","Phil",10000,15000,30000);
		inv.getProfits();
		System.out.println("\n����Ϊ��ֲ��״������");
		gar.plant();
	}
}
