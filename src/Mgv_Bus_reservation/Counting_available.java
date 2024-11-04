package Mgv_Bus_reservation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Counting_available {

	static String url="jdbc:mysql://localhost:3306/bus_reservation";  
    static String user="root";
    static String password="mukeshyadav";
	
	   public int booked_count(int busNo,Date date) throws SQLException {
		   
		   String query ="select count(name)from passenger_details where busno=? and busBookingdate=?";
		 
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pst= con.prepareStatement(query);
			java.sql.Date sqldate=new java.sql.Date(date.getTime());
			pst.setInt(1,busNo);
			pst.setDate(2,sqldate);
			
			ResultSet rs =pst.executeQuery();
			rs.next();
						
		   return rs.getInt(1);
	   
	   }
	   
	   public static void BusTicket_Booking(String passenger, int busno, java.sql.Date sqldate) throws SQLException {
    	   
    	   		   
    	   String query="insert into passenger_details values (?,?,?)";
    		   
    		   
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement st= con.prepareStatement(query);
		     
			st.setString(1,passenger);
			st.setInt(2, busno);
			st.setDate(3, sqldate);
			st.executeUpdate();
			
			System.out.println("Insert Succefully");
       }
	
}
