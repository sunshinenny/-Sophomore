import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		String a = "-7 9 20 29 36 78 88";
		int i,j;
		//�����ַ���
		String[] b = a.split(" ");	
		
		//ת��Ϊint��
		int[] arr=new int[b.length];
		for(i=0;i<b.length;i++) {
			arr[i]=Integer.parseInt(b[i]);
		}
		Arrays.sort(arr);
		
		for(j=arr.length-1,i=0;j>=0;j--,i++) {
			b[i]=String.valueOf(arr[j])+" ";
		}
		
		for(i=0;i<b.length;i++)	System.out.print(b[i]);
		//warming:û��תΪ�ַ���,ֻ���ַ�����
		
		
	}
}
