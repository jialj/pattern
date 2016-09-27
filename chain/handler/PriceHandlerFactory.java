package chain.handler;
/**
 * 生产价格处理者的工厂函数
 * @author SmartMan
 *
 */
public class PriceHandlerFactory {

		public static PriceHandler creatHandler() {
			PriceHandler sales = new Sales();
			PriceHandler manager = new Manager();
			PriceHandler ceo = new Ceo();
			
			/**
			 * 设置责任链
			 */
			//sales.successor = manager;
			sales.setSuccessor(manager);
			//manager.successor = ceo;
			manager.setSuccessor(ceo);
			
			return sales;
		}
}