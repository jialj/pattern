package adapter;

public class Test {
	
	public static void main(String[] args){
		/*
		DBSocketInterface dbSocket = new DBSocket();
		Hotel hotel = new Hotel(dbSocket);
		hotel.charge();*/
		
		GBSocketInterface gbSocket = new GBSocket();  
        
        Hotel hotel = new Hotel();  
          
        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);  
          
        hotel.setSocket(socketAdapter);  
          
        hotel.charge();  
		
	}
	
}
