package chain.handler;

public class Manager extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount>0.05 && discount <= 0.1){
			System.out.println(this.getClass().getName());
		}else{
			System.out.println(this.getClass().getName()+"放弃处理");
			successor.processDiscount(discount);
		}

	}

}
