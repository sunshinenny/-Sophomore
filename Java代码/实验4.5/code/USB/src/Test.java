
public class Test {
	public static void main(String[] args){
		Computer c=new Computer();
		c.add(new camera());
		c.add(new uPan());
		c.powerOn();
		System.out.println();
		c.powerOff();
	}
}
