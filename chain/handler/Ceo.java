package chain.handler;

public class Ceo extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		System.out.println(this.getClass().getName());
		
	}

}
