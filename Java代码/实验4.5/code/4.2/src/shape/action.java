package shape;

public class action implements ShapeCompute{
	
	int a,b,c,x,y,r;
	
	public void display() {
			System.out.println("test");
		}

		public void getArea() {

		}

		public void getPerimeter() {
			//this.a=a;this.b=b;this.c=c;this.x=x;this.y=y;
		}


}

class Coordinates extends action {
	void getXy(int x,int y){
		this.x=x;this.y=y;	
	}
}
class Circle extends Coordinates{
	void show(int r){
		System.out.println("圆心坐标为:"+x+","+y+" 半径为:"+r+"的圆");
	}
}


