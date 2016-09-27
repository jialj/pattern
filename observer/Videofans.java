package observer;

public class Videofans implements Observer{
	
	private String name;
	
	public Videofans (String name){
		this.name = name;
	}
	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub
		System.out.println(this.name + ", new videos are available! ");
        // print video list
        System.out.println(s);
	}

}
