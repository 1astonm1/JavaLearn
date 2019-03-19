package house;
import DB.MyDataBase;

public class Information_Operation{
	private static House_Information house = new House_Information();


	public static void InformationInit(String tableNmae,int j) {
		house.setName(MyDataBase.dataBaseStringOutPut(tableNmae, j, "NAME"));
		house.setArea(MyDataBase.dataBaseIntOutPut(tableNmae, j, "AREA"),j);
		house.setPrice(MyDataBase.dataBaseIntOutPut(tableNmae, j, "PRICE"),j);
	}
	
	public static void House_Operation(String name,int area,int price,int i) {
		house.setName(name);
		house.setArea(area,i);
		house.setPrice(price,i);
	}	
	public static void setHouseName(String name) {
		house.setName(name);
	}
	public static void setHouseArea(int area,int i) {
		house.setArea(area,i);
	}
	public static void setHousePrice(int price,int i) {
		house.setPrice(price,i);
	}
	public static void printHouseInformation() {
		house.printInformation();
	}
	public static Object getHouse() {
		return house;
	}
	public String getHouseName() {
		return house.getName();
	}
	public int getHouseArea() {
		return house.getArea();
	}
	public int getHousePrice() {
		return house.getPrice();
	}
	public int getHouseTotalPrice() {
		return house.getTotalPrice();
	}
	public static void newHouseInformation(String tableName,String name,int area,int price) {
		int IDNumber = 0;
		IDNumber = MyDataBase.dataBaseCheckID(tableName);
		System.out.println(IDNumber);
		MyDataBase.dataBaseInsert(tableName, IDNumber, name, area, price);
	}
	public static void deleteHouseInformation(String tableName,int choose) {
		MyDataBase.dataBaseDelteInsert(tableName,choose);
		//MyDataBase.dataBasePrint(tableName);
	}
	public static void printInformation(int choose) {
		String tableName = "";
		if(choose == 1) {
			tableName = "NewHouse";
		}
		else if (choose == 2) {
			tableName = "oldHouse";
		}
		MyDataBase.dataBasePrint(tableName);
	}
}

