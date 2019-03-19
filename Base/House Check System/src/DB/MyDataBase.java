package DB;
import java.sql.*;

public class MyDataBase {
	
	//���ݿ��ʼ�����Ӽ��
	public static void dataBaseInit() {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		try {
			Class.forName(driverName);
			System.out.println("�������سɹ���");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("δ�ҵ�����!");
		}
		String ConnectDB = "jdbc:sqlserver://localhost:1433;DatabaseName = House";
		String userName = "astonm";
		String userPassword = "jjzm1111"; 
		
		try {
			Connection con = DriverManager.getConnection(ConnectDB, userName, userPassword);
			Statement stmt = con.createStatement();
			
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���ݿ������쳣��");
		}
	}
	//�����ó�ʼ������
	public static void dataBaseInitTest() {
		MyDataBase.dataBaseInsert("NewHouse",1,"'a1'",120,25000);
		MyDataBase.dataBaseInsert("NewHouse",2,"'a2'",200,40000);
		MyDataBase.dataBaseInsert("NewHouse",3,"'a3'",256,25698);
		MyDataBase.dataBaseInsert("NewHouse",4,"'a4'",206,12548);
		MyDataBase.dataBaseInsert("NewHouse",5,"'a5'",258,23548);
		MyDataBase.dataBaseInsert("NewHouse",6,"'a6'",127,56824);
		MyDataBase.dataBaseInsert("NewHouse",7,"'a7'",112,76254);
		MyDataBase.dataBaseInsert("NewHouse",8,"'a8'",116,22548);
		MyDataBase.dataBaseInsert("NewHouse",9,"'a9'",159,25489);
		MyDataBase.dataBaseInsert("NewHouse",10,"'a10'",759,66584);
	} 
	//��½���ݿ�
	public static Statement dataBaseRegister() {
		String ConnectDB = "jdbc:sqlserver://localhost:1433;DatabaseName = House";
		String userName = "astonm";
		String userPassword = "jjzm1111"; 
		
		try {
			Connection con = DriverManager.getConnection(ConnectDB, userName, userPassword);
			Statement stmt = con.createStatement();
			
			return stmt;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���ݿ������쳣��");
		}
		return null;
	
	}
	//����һ�����
	public static void dataBaseCreatTable(String tableName) {
		Statement stmt = dataBaseRegister();
		try {
			stmt.executeUpdate("CREATE TABLE "+tableName+"(ID INT PRIMARY KEY NOT NULL,NAME NCHAR(10),AREA INT,PRICE INT,TOTALPRICE INT)");
			System.out.println("�����±��");
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ������쳣��");
		}
		
		
	}
	//ɾ��һ�����
	public static void dataBaseDelteTable(String tableName) {	
		Statement stmt = dataBaseRegister();
		try {
			stmt.executeUpdate("DROP TABLE "+tableName);
			System.out.println("ɾ�����!");

			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ������쳣��");
		}
		
	}
	//��ʾһ������е���������
	public static void dataBasePrint(String tableName) {
		Statement stmt = dataBaseRegister();
		int i = 1;
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableName);
			while(rs.next()) {
				System.out.println(i+"\t"+rs.getString("NAME")+"\t"+rs.getInt("AREA")
									+"\t"+rs.getInt("PRICE")+"\t"+rs.getInt("TOTALPRICE"));
				i++;
			}
			System.out.println("\r\n");
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//����һ�е�ֵ
	public static void dataBaseInsert(String tableName,int ID,String NAME,int area,int price) {
		Statement stmt = dataBaseRegister();
		int totalPrice = area*price;
		try {
			stmt.executeUpdate("INSERT INTO DBO."+tableName+" VALUES("
								+ID+", "+NAME+" ,"+area+","+price+","+totalPrice+")");
			System.out.println("���ݲ���ɹ�!");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//ɾ��ĳ�е�ֵ
	public static void dataBaseDelteInsert(String tableName,int j) {
		
		Statement stmt = dataBaseRegister();
		int ID1 = 0;
		int i = 1;
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY ID");
			while(rs.next()) {
				if(i == j) {
					ID1 = rs.getInt("ID");
					break;
				}
				i++;
			}	
			String cmd3 = "DELETE FROM "+tableName+" WHERE ID = "+ID1;
			stmt.executeUpdate(cmd3);
			System.out.println("����ɾ����ϣ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//��ʾĳһ�е�ֵ
	public static void dataBasePrintSingle(String tableName,int j) {
		Statement stmt = dataBaseRegister();
		int ID1 = 0;
		int i = 1;
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY ID");
			while(rs.next()) {
				if(i == j) {
					ID1 = rs.getInt("ID");
					break;
				}
				i++;
			}
			rs = stmt.executeQuery("SELECT * FROM "+tableName+" WHERE ID = '"+ID1+"'");
			while(rs.next()) {
				System.out.println(rs.getString("NAME")+"\t"+rs.getInt("AREA")+"\t"+rs.getInt("PRICE")+"\t"+rs.getInt("TOTALPRICE"));
			}
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��j�������ʾ
	public static void dataBasePrintOrder(String tableName,int j) {
		Statement stmt = dataBaseRegister();
		int i = 1;
		if(j == 1) {	//j=1���۸�����
			try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY PRICE");
			while(rs.next()) {
				System.out.println(i+"\t"+rs.getString("NAME")+"\t"+rs.getInt("AREA")+"\t"+rs.getInt("PRICE")+"\t"+rs.getInt("TOTALPRICE"));
				i++;
				
			}
			stmt.close();
			System.out.println("\r\n");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		if(j == 2) {	//j=2���������
			try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY AREA");
			while(rs.next()) {
				System.out.println(i+"\t"+rs.getString("NAME")+"\t"+rs.getInt("AREA")+"\t"+rs.getInt("PRICE")+"\t"+rs.getInt("TOTALPRICE"));
				i++;
				
			}
			stmt.close();
			System.out.println("\r\n");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		if(j == 3) {	//j=3���ܼ�����
			try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY TOTALPRICE");
			while(rs.next()) {
				System.out.println(i+"\t"+rs.getString("NAME")+"\t"+rs.getInt("AREA")+"\t"+rs.getInt("PRICE")+"\t"+rs.getInt("TOTALPRICE"));
				i++;
				
			}
			stmt.close();
			System.out.println("\r\n");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}
	//�޸�ĳ��ֵ var:�޸ĵĶ��� input:�ı��ֵ  j��Ҫ�Ķ��ĵڼ���
	public static void dataBaseChangeSingle(String tableName,int j,String var,int input) {
		Statement stmt = dataBaseRegister();
		int ID1 = 0;
		int i = 1;
		int price = 0;
		int area = 0;
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY ID");
			while(rs.next()) {
				if(i == j) {
					ID1 = rs.getInt("ID");

					break;
				}
				i++;		
			}								//�õ���Ҫ�޸ĵ�λ��
			stmt.executeUpdate("UPDATE "+tableName+" SET "+var+" = "+input+" WHERE ID ="+ID1);
			//��������
			rs = stmt.executeQuery("SELECT * FROM "+tableName+" WHERE ID = '"+ID1+"'");
			while(rs.next()) {
				price = rs.getInt("PRICE");
				area = rs.getInt("AREA");
			}
			int totalPrice = 0;
			totalPrice = price*area;
			stmt.executeUpdate("UPDATE "+tableName+" SET TOTALPRICE = "+totalPrice+" WHERE ID ="+ID1);	
		}catch(SQLException e){
			e.printStackTrace();
			}
	}
	//���ĳһ�е�String���� j:�ڼ���   var:������
	public static String dataBaseStringOutPut(String tableName,int j,String var) {
		String OutputString = "";
		Statement stmt = dataBaseRegister();
		int ID1 = 0;
		int i = 1;
		ResultSet rs;
		try {
			rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY ID");
			while(rs.next()) {
			if(i == j) {
				ID1 = rs.getInt("ID");
				break;
			}
			i++;
		}
			rs = stmt.executeQuery("SELECT * FROM "+tableName+" WHERE ID = '"+ID1+"'");
			while(rs.next()) {
				OutputString = rs.getString(var);
			}
			stmt.close();
			return OutputString;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
		
	}
	//���ĳһ�е�Int���� j:�ڼ���   var:������
	public static int dataBaseIntOutPut(String tableName,int j,String var) {
		int OutputInt = 0;
		Statement stmt = dataBaseRegister();
		int ID1 = 0;
		int i = 1;
		ResultSet rs;
		try {
			rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY ID");
			while(rs.next()) {
			if(i == j) {
				ID1 = rs.getInt("ID");
				break;
			}
			i++;
		}
			rs = stmt.executeQuery("SELECT * FROM "+tableName+" WHERE ID = '"+ID1+"'");
			while(rs.next()) {
				OutputInt = rs.getInt(var);
			}
			stmt.close();
			return OutputInt;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return 0;
		
	}
	//��鵱ǰIDֵ
	public static int dataBaseCheckID(String tableName) {
		int IDNumber = 0;
		Statement stmt = dataBaseRegister();
		int i = 1;
		ResultSet rs;
		try {
			rs = stmt.executeQuery("SELECT * FROM "+tableName+" ORDER BY ID");
			while(rs.next()) {
			IDNumber = rs.getInt("ID");
			i++;
			}
			IDNumber ++;
		}catch(SQLException e) {
			e.printStackTrace();	
		}
		return IDNumber;
	}
}












