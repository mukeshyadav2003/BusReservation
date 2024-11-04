package Mgv_Bus_reservation;

import java.sql.SQLException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ticket_process_main {
	public static void main(String[] args) throws SQLException {
		
	      Scanner scan = new Scanner(System.in);
		     
	     System.out.println("press 1 to bokking , press 2 to display, press 3 to cheack seat available ");
	     int key=scan.nextInt(); 
	     
	      switch(key){
	    	 
	      case 1:	
	    	  
	    	     Date date = null;
	    		System.out.println("Enter Name : ");
	    		String passenger=scan.next();
	    		System.out.println("Enter Bus No :");
	    		int busno=scan.nextInt();
	    		System.out.println("Enter Booking date : ");
	    		String dateoutput=scan.next();
	    		SimpleDateFormat dateformate=new SimpleDateFormat("yyyy-MM-dd");
	    		
	    	    try {	 
	    		   date=dateformate.parse(dateoutput);	
	    		} 
	    	    catch (ParseException e) {
	    			e.printStackTrace();	
	    		}
	    	    
	    	    java.sql.Date sqldate=new java.sql.Date(date.getTime());
	    	    
	    	   Counting_available.BusTicket_Booking(passenger,busno,sqldate);
	    		 break;	 
	      case 2:
		        BDO.BusDetails();	
		      break;  
		      
	      case 3:
	    	  System.out.println("Enter Bus id : ");
	    	  int bus_id=scan.nextInt();
	    	  BDO.seatAvailabele(bus_id);
	    	    
	      }
	      
	      

	
	       
	     
//	     
	       
	       int useropt=1;
	        
//	       while(useropt==1) {
//	    	   System.out.println("Enter 1 to book and 2 to exit");
//	    	   useropt=scan.nextInt();
//	    	   
//	    	   if(useropt==1) {
//	    		  Ticket_Booking T_Booking = new Ticket_Booking();
//	    		  if(T_Booking.isavailable(buses,booking)) {
//	    			  
//	    			  booking.add(T_Booking);
//	    			  System.out.println("Booking Confirmed");
//	    		  }
//	    		  else {
//	    			  System.out.println("Booking Not Available");
//	    		  }
//	    	   }
//	       }
	     } 
}
