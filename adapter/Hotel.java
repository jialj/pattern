package adapter;

public class Hotel {
	private DBSocketInterface dbSocket;
	
	public Hotel(){
		
	}
	
	public Hotel(DBSocketInterface dbSocket){
		this.dbSocket = dbSocket;
	}
	
	public void setSocket (DBSocketInterface dbSocket){  
        this.dbSocket = dbSocket;  
    }  
  
    //�ù�����һ�����Ĺ���  
    public void charge(){
          
        //ʹ�õ±��ڳ��  
        dbSocket.powerWithTwoRound();  
    }  
}
