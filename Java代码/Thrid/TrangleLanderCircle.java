
class Trangle{
	private double a,b,c;
	private double l,s,p;
	//char ls;
	int flag=1;
	
	public void setAbc(double a,double b,double c){
		this.a=a;this.b=b;this.c=c;
		if(a<=0|b<=0|c<=0){
			System.out.println("�������������");
			this.flag = 0;
		}
		if( (a+b<=c) | (a+c<=b) | (b+c)<=a){
			System.out.println("�������������");
			this.flag = 0;
		}
	}

	void judgment(){
		if(flag==1){
			if( (a*a+b*b==c*c) | (a*a+c*c==b*b) | (b*b+c*c==a*a) ){
				System.out.println("ֱ��������\t"+"����Ϊ:"+a+" "+b+" "+c);
				calc(); 
			}
			
			else if( a==b | a==c |b==c ){
				System.out.println("����������\t"+"����Ϊ:"+a+" "+b+" "+c);
				calc();
			}
			else if( a==b&b==c){
				System.out.println("�ȱ�������\t"+"����Ϊ:"+a+" "+b+" "+c);
				calc();
			}
			else System.out.println("��ͨ������\t"+"����Ϊ:"+a+" "+b+" "+c);
		}
	}
	
	void calc(){
		l=this.a+this.b+this.c;
		p=l/2;
		s=Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
		System.out.println("�ܳ���"+l+"\n�����"+s);
	}
	
}

class Lander{
	private double a,b,c;
	private double s;
	public void setAbc(double a,double b,double c){
		this.a=a;this.b=b;this.c=c;
	}
	void calc(){
		System.out.println("\n����\t"+"�ϵ�:"+a+" �µ�: "+a+" ��:"+c);
		
		s=(this.a+this.b)*this.c/2;
		
		System.out.println("�����"+s);
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
			System.out.println("\nԲ\t"+"�뾶:"+r+"\n�ܳ�:"+l+"\n�����"+s);
		}
		else System.out.println("���ݷǷ�");
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
