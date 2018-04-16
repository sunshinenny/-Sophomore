package Test;
import Others.Gardener;
import Others.Inverstor;

public class test {
	public static void main(String[] args){
		//Fruit f=new Fruit("苹果 ","梨 ","香蕉 ",30000,10000,15000);
		Gardener gar=new Gardener("苹果 ","梨 ","香蕉 ",30000,10000,15000);
		Inverstor inv=new Inverstor("Sunny","SunShine","Phil",10000,15000,30000);
		inv.getProfits();
		System.out.println("\n以下为种植现状与评估");
		gar.plant();
	}
}
