package athena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Athena {

	public static void main(String[] args) throws Exception {
		Class.forName("com.simba.athena.jdbc.Driver");
		
		Properties prop = new Properties();
		prop.setProperty("user", "");
		prop.setProperty("password", "");
		prop.put("S3OutputLocation", "s3://adsathenaresults/results/");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			conn = DriverManager.getConnection("jdbc:awsathena://athena.us-east1.com:443;AwsRegion=us-east-1;Schema=bistudio", prop);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from bistudio_example limit 10");
			while(rs.next()) {
				System.out.println(rs.getString("sales_reason"));
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		}
		
		
		
	}

}
