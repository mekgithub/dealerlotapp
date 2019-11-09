package tk.dealerlot.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbUtil {
	
	public static void main(String[] args) {
		getNumberOfCarsFromDb();
	}
	
	
	public static int getNumberOfCarsFromDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://95.217.14.25:3306/dealerlot?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&"
                    		,"testuser"
                    		,"Password@1");
			Statement statement = conn.createStatement();
			
			String sampleQuery = "SELECT * FROM cars";
			
			ResultSet rs = statement.executeQuery(sampleQuery);
			
			 while (rs.next()) {
				 System.out.println(rs.getString("model"));
			 }
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public static String getModelNameByStockNumber(int stockNumber) {
		
		return null;
	}
}
