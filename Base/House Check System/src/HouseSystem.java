import java.util.Scanner;

import DB.MyDataBase;
import house.House_Information;
import house.Information_Operation;
//import house.House_Information;


public class HouseSystem {
	
	public static void main(String[] args) {

		MyDataBase.dataBaseInit();
		menu();
	}
	//ѡ����
	public static String chooseTable(int choose) {
		String tableName = "";
		if(choose == 1) {
			tableName = "NewHouse";
		}
		else if(choose == 2) {
			tableName = "OldHouse";
		}
		return tableName;
	}
	
	//�޸���Ϣ���� choose 1��ѡ���·���2����ѡ����ַ�
	public static void changeInformation(int choose) {
		short temp = 0;
		short temp1 = 0;
		int inPut = 0;
		String tableName = "";
		tableName = chooseTable(choose);
		
		System.out.println("������Ҫ�޸ĵ���ţ�");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextShort();
		Information_Operation.InformationInit(tableName, temp);
		Information_Operation.printHouseInformation();
		System.out.println("��������Ҫ�޸ĵ����1����� 2���۸�  ");
		temp1 = sc.nextShort();
		if(temp1 == 1) {
			System.out.println("�޸�������������޸�ֵ!");
			inPut = sc.nextInt();
			Information_Operation.setHouseArea(inPut, temp);
			System.out.println("�޸����!");
		}
		else if (temp1 == 2) {
			System.out.println("�޸ļ۸��������޸�ֵ!");
			inPut = sc.nextInt();
			Information_Operation.setHousePrice(inPut, temp);
			System.out.println("�޸����!");
	
		}
		Information_Operation.printHouseInformation();
	//	MyDataBase.dataBasePrint(tableName);
	}
	
	//������Ϣ����:(�����ݿ������һ����Ϣ)choose 1��ѡ���·���2����ѡ����ַ�
	public static void newInformation(int choose) {
		String tableName = "";
		int area = 0;
		int price = 0;
		String houseName = "";
		tableName = chooseTable(choose);
		
		System.out.println("�����·�Դ��Ϣ��\r\n�������·����֣�");
		Scanner sc = new Scanner(System.in);
		houseName = sc.nextLine();
		houseName = "'"+houseName+"'";
		System.out.println("�����������");
		area = sc.nextInt();
		System.out.println("������۸�");
		price = sc.nextInt();
		//MyDataBase.dataBaseInsert(tableName, 11, houseName, area, price);
		Information_Operation.newHouseInformation(tableName, houseName, area, price);
		//MyDataBase.dataBasePrint("NewHouse");
	}
	
	//ɾ�����ݿ���ĳ�е���Ϣ
	public static void deleteInformation(int choose) {
		String tableName = "";
		tableName = chooseTable(choose);
		int j = 0;
		System.out.println("��������Ҫɾ����ֵ:");
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt();
		Information_Operation.deleteHouseInformation(tableName, j);

	}

	
	public static void menu() {
		int temp,temp1;
		boolean flag = true;
		boolean flag1 = false;
		while(flag) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~��ӭ������Դ����ϵͳ��~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(" 1���鿴�·�\r\n 2���鿴���ַ�\r\n 3���˳�ϵͳ");
			Scanner sc = new Scanner(System.in);
			temp = sc.nextInt();
			flag1 = true;
			while(flag1) {
				if(temp == 1) {
					Information_Operation.printInformation(temp);
					System.out.println("1����ӷ�Դ   2��ɾ����Դ  3���޸���Ϣ 4��������Ŀ¼");
					temp1 = sc.nextInt();
					if(temp1 == 1) {
						newInformation(temp);
						//temp1 = 0;
					}
					else if(temp1 == 2) {
						deleteInformation(temp);
						//temp1 = 0;
					}
					else if(temp1 == 3) {
						changeInformation(temp);
						//temp1 = 0;
					}
					else if(temp1 == 4) {
						flag1 = false;
					}
					else System.out.println("�밴����ʾ�������룡");
					
				}
				else if(temp == 2) {
					Information_Operation.printInformation(temp);
					System.out.println("1����ӷ�Դ   2��ɾ����Դ  3���޸���Ϣ 4��������Ŀ¼");
					temp1 = sc.nextInt();
					if(temp1 == 1) {
						newInformation(temp);
						//temp1 = 0;
					}
					else if(temp1 == 2) {
						deleteInformation(temp);
						//temp1 = 0;
					}
					else if(temp1 == 3) {
						changeInformation(temp);
						//temp1 = 0;
					}
					else if(temp1 == 4) {
						flag1 = false;
						//System.out.println("aaa");
						//break;
					}
				}//�޸ĵı�񲻶ԣ�
				
				
				
				
				
				
				
				
				else if(temp == 3) {
				
				}
			}
		}	
	}
	
}
	





