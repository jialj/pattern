package factory;

public class Man extends Human {

	@Override
	public void eat() {
		System.out.println(this.getClass().getName()+":eat()");
	}

	@Override
	public void sleep() {
		System.out.println(this.getClass().getName()+":sleep()");
	}

	@Override
	public void beatDouDou() {
		System.out.println(this.getClass().getName()+":beatDouDou()");
	}

}
