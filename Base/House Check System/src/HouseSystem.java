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
	//选择表格
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
	
	//修改信息函数 choose 1：选择新房，2：；选择二手房
	public static void changeInformation(int choose) {
		short temp = 0;
		short temp1 = 0;
		int inPut = 0;
		String tableName = "";
		tableName = chooseTable(choose);
		
		System.out.println("请输入要修改的序号：");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextShort();
		Information_Operation.InformationInit(tableName, temp);
		Information_Operation.printHouseInformation();
		System.out.println("请输入需要修改的序号1、面积 2、价格  ");
		temp1 = sc.nextShort();
		if(temp1 == 1) {
			System.out.println("修改面积，请输入修改值!");
			inPut = sc.nextInt();
			Information_Operation.setHouseArea(inPut, temp);
			System.out.println("修改完毕!");
		}
		else if (temp1 == 2) {
			System.out.println("修改价格，请输入修改值!");
			inPut = sc.nextInt();
			Information_Operation.setHousePrice(inPut, temp);
			System.out.println("修改完毕!");
	
		}
		Information_Operation.printHouseInformation();
	//	MyDataBase.dataBasePrint(tableName);
	}
	
	//增加信息函数:(向数据库中添加一行信息)choose 1：选择新房，2：；选择二手房
	public static void newInformation(int choose) {
		String tableName = "";
		int area = 0;
		int price = 0;
		String houseName = "";
		tableName = chooseTable(choose);
		
		System.out.println("输入新房源信息：\r\n请输入新房名字：");
		Scanner sc = new Scanner(System.in);
		houseName = sc.nextLine();
		houseName = "'"+houseName+"'";
		System.out.println("请输入面积：");
		area = sc.nextInt();
		System.out.println("请输入价格：");
		price = sc.nextInt();
		//MyDataBase.dataBaseInsert(tableName, 11, houseName, area, price);
		Information_Operation.newHouseInformation(tableName, houseName, area, price);
		//MyDataBase.dataBasePrint("NewHouse");
	}
	
	//删除数据库中某行的信息
	public static void deleteInformation(int choose) {
		String tableName = "";
		tableName = chooseTable(choose);
		int j = 0;
		System.out.println("请输入需要删除的值:");
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt();
		Information_Operation.deleteHouseInformation(tableName, j);

	}

	
	public static void menu() {
		int temp,temp1;
		boolean flag = true;
		boolean flag1 = false;
		while(flag) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~欢迎来到房源管理系统！~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(" 1、查看新房\r\n 2、查看二手房\r\n 3、退出系统");
			Scanner sc = new Scanner(System.in);
			temp = sc.nextInt();
			flag1 = true;
			while(flag1) {
				if(temp == 1) {
					Information_Operation.printInformation(temp);
					System.out.println("1、添加房源   2、删除房源  3、修改信息 4、返回主目录");
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
					else System.out.println("请按照提示重新输入！");
					
				}
				else if(temp == 2) {
					Information_Operation.printInformation(temp);
					System.out.println("1、添加房源   2、删除房源  3、修改信息 4、返回主目录");
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
				}//修改的表格不对！
				
				
				
				
				
				
				
				
				else if(temp == 3) {
				
				}
			}
		}	
	}
	
}
	





