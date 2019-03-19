package house;

import DB.MyDataBase;

public class House_Information {
	private String name;
	private int area;
	private int price;
	private int total_price;
	
	public House_Information() {}
	
	public House_Information(String name,int area,int price) {
		this.name = name;
		this.area = area;
		this.price = price;
		total_price = this.area * this.price;
		
	}
	//封装设置
	public void setName(String name) {
		this.name = name;
		
	}
	public void setArea(int area,int j) {
		this.area = area;
		total_price = this.area * this.price;
		MyDataBase.dataBaseChangeSingle("NewHouse", j, "AREA", area);
	}	
	public void setPrice(int price,int j) {
		this.price = price;
		total_price = this.area * this.price;
		MyDataBase.dataBaseChangeSingle("NewHouse", j, "PRICE", price);
	}	
	//封装读取
	public String getName() {
		return this.name;
	}
	public int getArea() {
		return area;
	}
	public int getPrice() {
		return price;
	}
	public int getTotalPrice() {
		total_price = price * area;
		return total_price;
	}
	//功能函数
	public void printInformation() {//显示所有信息
		System.out.println("小区名称："+name);
		System.out.println("面积："+area);
		System.out.println("单价："+price);
		System.out.println("总价："+total_price);		
	}

}


