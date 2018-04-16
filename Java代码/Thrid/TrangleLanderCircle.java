
class Trangle{
	private double a,b,c;
	private double l,s,p;
	//char ls;
	int flag=1;
	
	public void setAbc(double a,double b,double c){
		this.a=a;this.b=b;this.c=c;
		if(a<=0|b<=0|c<=0){
			System.out.println("不能组成三角形");
			this.flag = 0;
		}
		if( (a+b<=c) | (a+c<=b) | (b+c)<=a){
			System.out.println("不能组成三角形");
			this.flag = 0;
		}
	}

	void judgment(){
		if(flag==1){
			if( (a*a+b*b==c*c) | (a*a+c*c==b*b) | (b*b+c*c==a*a) ){
				System.out.println("直角三角形\t"+"三边为:"+a+" "+b+" "+c);
				calc(); 
			}
			
			else if( a==b | a==c |b==c ){
				System.out.println("等腰三角形\t"+"三边为:"+a+" "+b+" "+c);
				calc();
			}
			else if( a==b&b==c){
				System.out.println("等边三角形\t"+"三边为:"+a+" "+b+" "+c);
				calc();
			}
			else System.out.println("普通三角形\t"+"三边为:"+a+" "+b+" "+c);
		}
	}
	
	void calc(){
		l=this.a+this.b+this.c;
		p=l/2;
		s=Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
		System.out.println("周长："+l+"\n面积："+s);
	}
	
}

class Lander{
	private double a,b,c;
	private double s;
	public void setAbc(double a,double b,double c){
		this.a=a;this.b=b;this.c=c;
	}
	void calc(){
		System.out.println("\n梯形\t"+"上底:"+a+" 下底: "+a+" 高:"+c);
		
		s=(this.a+this.b)*this.c/2;
		
		System.out.println("面积："+s);
	}
}

class Circle{
	private double r,l,s;
	public void setR(double r){
		this.r=r;
	}
	
	void calc(){
		if(r>0){
			l=Math.PI*2*r;
			s=Math.PI*r*r;
			System.out.println("\n圆\t"+"半径:"+r+"\n周长:"+l+"\n面积："+s);
		}
		else System.out.println("数据非法");
	}
}
public class TrangleLanderCircle {
	public static void main(String[] args){
		Trangle t=new Trangle();
		Lander l=new Lander();
		Circle c=new Circle();
		
		t.setAbc(3,4,5);
		t.judgment();
		
		l.setAbc(3,4,5);
		l.calc();
		
		c.setR(18);
		c.calc();
	}
}
