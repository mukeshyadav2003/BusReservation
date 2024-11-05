package Mgv_Bus_reservation;


public class Bus_information {
	       
	private int BusNo,capacity;
	private boolean sleeper,ac,food;

		 Bus_information(int BusNo,int capacity,boolean ac,boolean sleeper,boolean food){
			 
			 this.BusNo=BusNo;
			 this.capacity=capacity;
			 this.sleeper=sleeper;
			 this.ac=ac;
			 this.food=food;
			 
		
	     }
		 
		 public int getBusNO() {
			 return BusNo;
		 }
		 public void setBusNo(int busno) {
			 
			 BusNo=busno;
		 }
		 
		 public int getcapacity() {
			 
			 return capacity;

		 }
         public void setcapacity(int cap) {
        	 
        	 capacity=cap;
         }
         public boolean getsleeper() {
        	 
        	 return sleeper;
         }
         public void setsleeper(boolean sleep) {
        	 
        	 sleeper=sleep;
         }
         
         public boolean getac() {
        	 return ac;
         }
         
         public void setac(boolean Ac) {
        	 ac=Ac;
         }
         public boolean getfood() {
        	 return food;
         }
         public void setfood(boolean foood) {    	 
     	   food=foood; 
         }
         


}
