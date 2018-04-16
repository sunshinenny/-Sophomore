
public class Computer {
	private USB[] usbArr=new USB[2];
	public void add(USB usb){
		for(int i=0;i<usbArr.length;i++){
			if(usbArr[i]==null){
				usbArr[i]=usb;
				break;
			}
		}
	}
	
	public void powerOn(){
		for(int i=0;i<usbArr.length;i++){
			if(usbArr[i]==null){
				usbArr[i].turnOn();
			}
		}			
		System.out.println("²âÊÔ³É¹¦");
	}

		
		public void powerOff(){
			for(int i=0;i<usbArr.length;i++){
				if(usbArr[i]!=null){
					usbArr[i].turnOff();
					}
			}	
			System.out.println("²âÊÔ½áÊø");
		}
}
