package chain.custom;

import chain.handler.PriceHandler;
import chain.handler.PriceHandlerFactory;



/**
 * ¿Í»§
 * @author SmartMan
 */
public class Custom {
	private PriceHandler priceHandler;
	
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}
	
	public static void main(String[] args){
		Custom cus = new Custom();
		
		cus.setPriceHandler(PriceHandlerFactory.creatHandler());

		cus.requestDiscount((float) 0.08);
		//cus.requestDiscount(discount);
	}
}
