
package Mgv_Bus_reservation;
import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ticket_Booking {

	String passenger;
	int busno;
	Date date; 
	
	Ticket_Booking(){
	
		 
		
	}
	 public boolean isavailable(ArrayList<Bus_information> buses,ArrayList<Ticket_Booking> booking) {
		 int capacity=0;
		 for(Bus_information bus:buses) {
			 if(bus.getBusNO()==busno) 
				 capacity = bus.getcapacity();			
			   }		 
		 int booked=0;
	 for(Ticket_Booking tbook:booking) {
		 
		 if(tbook.busno == busno && tbook.date.equals(date)) {
			 booked++;
		 }
	 }
     return booked<capacity?true:false;
     
	}
}
    

