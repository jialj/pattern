package absfactory;
/**
 * ���幤��A�� ����ţ�̺�����
 * @author SmartMan
 *
 */
public class Akitchen implements KitchenFactory{

	@Override
	public Food getFood() {	
		return new Mike();
	}

	@Override
	public TableWare getTableWare() {	
		return new Spoon();
	}
	 

}
