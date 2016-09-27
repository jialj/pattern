package adapter;
/**
 * @中国插座，实现了国际接口
 * @author SmartMan
 *
 */
public class GBSocket implements GBSocketInterface {

	@Override
	public void powerWithThreeFlat() {
		// TODO Auto-generated method stub
		System.out.println("使用国际标准三项扁插头充电");
	}

}
