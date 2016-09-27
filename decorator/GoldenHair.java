package decorator;

public class GoldenHair extends GirlDecorator {
	
	private Girl girl;
	
	public GoldenHair(Girl g){
		girl = g;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return girl.getDescription()+"golden hair";
	}

}
