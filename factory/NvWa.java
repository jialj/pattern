package factory;

public class NvWa {
	public static void main(String[] args){
		Human human = HumanFactory.createHuman("man");
		human.eat();
		human.sleep();
		human.beatDouDou();
	}
}
