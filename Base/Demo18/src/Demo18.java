//�ų��ظ�������ϰ
import java.util.Arrays;

public class Demo18 {
	public static void main(String[] args) {
		int[] arr = {5,8,6,9,5,6,8,4,9,5,2,1,11,5,9,8,4,11,6,9,8,7,4,22,5,11,22,5,44,8,44,8,996,5,4,11,2,5};//����������
		//int[] arr = {11,5,8,6,9,6,8,11,9};
		int[] tool = new int[arr.length];//����������
		int count = 0;//���ظ�����
		int j = 1;
		int z = 1;
		
		System.out.println("ԭ���飺"+Arrays.toString(arr));
		arr = sorting(arr);//����
		tool = check(arr);//�����ظ�������λ��
		count = tool[0];//ȡ������
		for(int i=1;i<arr.length;i++) {//�޳��ظ�ֵ
			if (i == tool[z]) {//�ṩ����������������ͬ��˵���ظ����޳�
				z++;
			}
			else 	//���ظ�������
			{
				arr[j] = arr[i];
				j++;
			}
		}
		int[] newarr =new int[arr.length - count];	//����������
		for(int i=0;i<newarr.length;i++) {	//���ݷ��ظ�Ԫ��
			newarr[i] = arr[i];
		}
		System.out.println("�ظ�������"+count+"\r\n������:"+Arrays.toString(newarr));

	}
	
	//����
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
	//ȥ����ͬԪ��
	public static int[] check(int[] arr) {
		int len = 0;
		len = arr.length;
		int count = 0;
		int repeatOld = 0;//�����ж��Ƿ��ظ���������һ����ͬԪ�ص�ֵ����ǰ�ȶԣ�����ֱͬ������
		int[] arrCheck = new int[arr.length];
		for(int i=0;i<len;i++) {
			//�����ظ�����
//			System.out.println(repeatOld);
//			if(arr[i] == repeatOld) {
//				//continue;
//			}
			if(arr[i] != repeatOld){
				for(int j=i+1;j<len;j++) {//�����ظ�ֵ
					if(arr[i] == arr[j]) {
						count++;
						arrCheck[count] = j;
						repeatOld = arr[j];
					//	System.out.println(arr[j]+"+"+j);
					}
				}
			}
		}
		arrCheck[0] = count;//�ظ�����
//		System.out.println("ԭ���飺"+Arrays.toString(arrCheck));
		return arrCheck;//��1Ϊ��ʾ�ظ��ĸ����������������ظ�������
	}
}


