package factory;

public class HumanFactory {
	public static Human createHuman(String type){
		Human human = null;
		if( "man".equals(type)){
			human = new Man();
		}else{
			human = new Feman();
		}
		return human;
	}
}
