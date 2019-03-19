import java.util.Arrays;

public class Demo29 {
	static int[] numbuff =  {99,88,77,66,55,44,33,22,11,10,9,8,7,6,5,4,3,2,1}; 
	static int[] testbuff = {1,3,5,7,9};
	public static void main(String[] args) {
		int temp;
		newBuff(numbuff);
		temp = binary_search(testbuff,1);
		System.out.println(temp+1);
	}
	
	public static int getBuffLength(int[] buff) {
		int length = buff.length;
		return length;
	}
	
	public static void newBuff(int[] buff) {
		int length = getBuffLength(buff);
		int temp = 0;
		System.out.println(length);				
		System.out.println(Arrays.toString(buff));		
		for(int i=0;i<length;i++) {
			for(int j=0;j<length-i-1;j++) {
				if(buff[j+1] < buff[j]) {
					temp = buff[j+1];
					buff[j+1] = buff[j];
					buff[j] = temp;	
				}	
				System.out.println(Arrays.toString(buff));	
			}
		}
	}
	
	public static int binary_search(int[] list,int item) {
		int low,high,mid=0,temp;
		low = 0;
		high = list.length - 1;
		while(low <= high) {
			mid = (low + high)/2;
			temp = list[mid];
			if(temp == list[mid])
				return mid;
			else if(temp > list[mid]) 
				high = mid - 1;
			else 
				low = mid + 1;
		}
		//return mid;
	}
}



