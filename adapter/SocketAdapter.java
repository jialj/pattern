package adapter;

public class SocketAdapter implements DBSocketInterface{
	
	//���ʽӿ�
	private GBSocketInterface gbSocket;
	
	/**
	 * �ڴ�������������ʱ�����봫��һ���½ӿڵ�ʵ����
	 * @param gbSocket
	 */
	public SocketAdapter(GBSocketInterface gbSocket){
		this.gbSocket = gbSocket;
	}
	
	@Override
	public void powerWithTwoRound() {
		// TODO Auto-generated method stub
		gbSocket.powerWithThreeFlat();
	}
	
}
