package decorator;

public class Tall extends GirlDecorator {
	
	private Girl girl;
	
	public Tall(Girl g){
		girl = g;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return girl.getDescription() + "very tall";
	}

}
