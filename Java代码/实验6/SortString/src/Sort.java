import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		String a = "-7 9 20 29 36 78 88";
		int i,j;
		//分离字符串
		String[] b = a.split(" ");	
		
		//转换为int类
		int[] arr=new int[b.length];
		for(i=0;i<b.length;i++) {
			arr[i]=Integer.parseInt(b[i]);
		}
		Arrays.sort(arr);
		
		for(j=arr.length-1,i=0;j>=0;j--,i++) {
			b[i]=String.valueOf(arr[j])+" ";
		}
		
		for(i=0;i<b.length;i++)	System.out.print(b[i]);
		//warming:没有转为字符串,只是字符数组
		
		
	}
}
