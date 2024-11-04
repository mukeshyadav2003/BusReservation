package Mgv_Bus_reservation;
import java.sql.*;
import java.util.Date;

public class BDO {

	       static String url="jdbc:mysql://localhost:3306/bus_reservation";  
	       static String user="root";
	       static String password="mukeshyadav";
	       
	       
	       public static void  BusDetails()  {           //BUS DETAILS DISPLAY
	    	   
	    	try {   
	    	   
	    	   String query="Select*from bus_information";
	    	   
	           Connection con = DriverManager.getConnection(url,user,password);
	           Statement st =con.createStatement();
	         
	          ResultSet rs=  st.executeQuery(query);
	          
	          System.out.println("Bus Information : ");
	          System.out.println("___________________");
	          
	          
	          // BUS INFORMATION LOOPING
	          while(rs.next()) {
	        	  	        	  	       	        	  
	        	  System.out.println("Bus No : " + rs.getInt(1));        // 1 TABLE IS BUS NO
	        	  
	        	  if(rs.getInt(2)==0)                                   // AC TRUE 1 OR FALSE 0     AND   12 TABLE IS AC
	        		  System.out.println("Ac : false");
	        	  else {
	        		  System.out.println("AC : true");
	        	  }
	        	  
	        	  System.out.println("capacity : " + rs.getInt(3));    // 3 IS CAPACITY
	        	  
	        	  if(rs.getBoolean(4)==true)                          // 4 IS FOOD
	        	  System.out.println("food : true");
	        	  else
	        		  System.out.println("food : false");
	        	  
	        	  if(rs.getBoolean(5)==true) {                       //SLEEPER TRUE OR FALSE
	        		  System.out.println("sleeper : true");
	        	  }
	        	  else {
	        		  System.out.println("sleeper : false");
	        	  }
	        	  System.out.println("--------------------");
	          }
	          
	       }
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	       }
	       
	       

		public static void seatAvailabele(int busid) {
			
	         String query="select*from bus_information where"+ busid;
			
	         try {
				Connection con =DriverManager.getConnection(url,user,password);
				Statement st= con.createStatement();
				ResultSet rs = st.executeQuery(query);
				rs.next();
				System.out.println("bus capacity :");
			     } 
	 
	         catch (SQLException e) 
	         {
				e.printStackTrace();
			 }
			
		}
	       
	       
}
