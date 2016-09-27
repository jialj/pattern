package absfactory;

public class Client {
	public void eat(KitchenFactory kf){
		System.out.println("eat:"+kf.getFood().getEatAble()+
				"  with:"+kf.getTableWare().getTool());
	}
	
	public static void main(String[] args){
		Client c = new Client();
		KitchenFactory kf = new Akitchen();
		c.eat(kf);
	}
}
