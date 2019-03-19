//排除重复数据练习
import java.util.Arrays;

public class Demo18 {
	public static void main(String[] args) {
		int[] arr = {5,8,6,9,5,6,8,4,9,5,2,1,11,5,9,8,4,11,6,9,8,7,4,22,5,11,22,5,44,8,44,8,996,5,4,11,2,5};//待处理数组
		//int[] arr = {11,5,8,6,9,6,8,11,9};
		int[] tool = new int[arr.length];//处理辅助数组
		int count = 0;//计重复个数
		int j = 1;
		int z = 1;
		
		System.out.println("原数组："+Arrays.toString(arr));
		arr = sorting(arr);//排序
		tool = check(arr);//标明重复个数，位置
		count = tool[0];//取出个数
		for(int i=1;i<arr.length;i++) {//剔除重复值
			if (i == tool[z]) {//提供索引与现有索引相同，说明重复，剔除
				z++;
			}
			else 	//不重复，保留
			{
				arr[j] = arr[i];
				j++;
			}
		}
		int[] newarr =new int[arr.length - count];	//建立新数组
		for(int i=0;i<newarr.length;i++) {	//传递非重复元素
			newarr[i] = arr[i];
		}
		System.out.println("重复个数："+count+"\r\n新数组:"+Arrays.toString(newarr));

	}
	
	//排序
	public static int[] sorting(int[] arr) {
		int len = 0;
		int temp = 0;
		len = arr.length;
		System.out.println("arrlength:"+len);
		for (int i=0;i<len;i++) {
			for (int j=0;j<(len-i-1);j++) {
				if (arr[j]>=arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	} 
	//去除相同元素
	public static int[] check(int[] arr) {
		int len = 0;
		len = arr.length;
		int count = 0;
		int repeatOld = 0;//用于判断是否重复计数，上一个相同元素的值跟当前比对，若相同直接跳过
		int[] arrCheck = new int[arr.length];
		for(int i=0;i<len;i++) {
			//避免重复计数
//			System.out.println(repeatOld);
//			if(arr[i] == repeatOld) {
//				//continue;
//			}
			if(arr[i] != repeatOld){
				for(int j=i+1;j<len;j++) {//计算重复值
					if(arr[i] == arr[j]) {
						count++;
						arrCheck[count] = j;
						repeatOld = arr[j];
					//	System.out.println(arr[j]+"+"+j);
					}
				}
			}
		}
		arrCheck[0] = count;//重复个数
//		System.out.println("原数组："+Arrays.toString(arrCheck));
		return arrCheck;//第1为表示重复的个数，往后依次是重复的索引
	}
}


