package absfactory;
/**
 * 抽象工厂
 * @author SmartMan
 *
 */
public interface KitchenFactory {
	public Food getFood();
	public TableWare getTableWare();
}
