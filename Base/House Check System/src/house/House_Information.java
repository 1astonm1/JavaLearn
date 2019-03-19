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
	//��װ����
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
	//��װ��ȡ
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
	//���ܺ���
	public void printInformation() {//��ʾ������Ϣ
		System.out.println("С�����ƣ�"+name);
		System.out.println("�����"+area);
		System.out.println("���ۣ�"+price);
		System.out.println("�ܼۣ�"+total_price);		
	}

}


