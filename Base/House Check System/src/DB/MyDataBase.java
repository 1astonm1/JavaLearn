package DB;
import java.sql.*;

public class MyDataBase {
	
	//数据库初始化连接检查
	public static void dataBaseInit() {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		try {
			Class.forName(driverName);
			System.out.println("驱动加载成功！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("未找到驱动!");
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
			System.out.println("数据库连接异常！");
		}
	}
	//测试用初始化函数
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
	//登陆数据库
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
			System.out.println("数据库连接异常！");
		}
		return null;
	
	}
	//创建一个表格
	public static void dataBaseCreatTable(String tableName) {
		Statement stmt = dataBaseRegister();
		try {
			stmt.executeUpdate("CREATE TABLE "+tableName+"(ID INT PRIMARY KEY NOT NULL,NAME NCHAR(10),AREA INT,PRICE INT,TOTALPRICE INT)");
			System.out.println("创建新表格");
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接异常！");
		}
		
		
	}
	//删除一个表格
	public static void dataBaseDelteTable(String tableName) {	
		Statement stmt = dataBaseRegister();
		try {
			stmt.executeUpdate("DROP TABLE "+tableName);
			System.out.println("删除表格!");

			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接异常！");
		}
		
	}
	//显示一个表格中的所有内容
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
	//插入一行的值
	public static void dataBaseInsert(String tableName,int ID,String NAME,int area,int price) {
		Statement stmt = dataBaseRegister();
		int totalPrice = area*price;
		try {
			stmt.executeUpdate("INSERT INTO DBO."+tableName+" VALUES("
								+ID+", "+NAME+" ,"+area+","+price+","+totalPrice+")");
			System.out.println("数据插入成功!");
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//删除某行的值
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
			System.out.println("数据删除完毕！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//显示某一行的值
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
	//按j排序后显示
	public static void dataBasePrintOrder(String tableName,int j) {
		Statement stmt = dataBaseRegister();
		int i = 1;
		if(j == 1) {	//j=1按价格排序
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
			
		if(j == 2) {	//j=2按面积排序
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
		
		if(j == 3) {	//j=3按总价排序
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
	//修改某个值 var:修改的东西 input:改变的值  j需要改动的第几个
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
			}								//得到需要修改的位置
			stmt.executeUpdate("UPDATE "+tableName+" SET "+var+" = "+input+" WHERE ID ="+ID1);
			//更新数据
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
	//输出某一行的String变量 j:第几个   var:变量名
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
	//输出某一行的Int变量 j:第几个   var:变量名
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
	//检查当前ID值
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












