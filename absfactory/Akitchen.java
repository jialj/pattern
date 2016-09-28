package absfactory;
/**
 * 具体工厂A， 返回牛奶和汤勺
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
