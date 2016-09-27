package observer;

public class Test {
	public static void main(String[] args){
		Videosite vs = new Videosite();
		
	    vs.registerObserver(new Videofans("LiLei"));
	    vs.registerObserver(new Videofans("HanMeimei"));
	    vs.registerObserver(new Videofans("XiaoMing"));

	    // add videos
	    vs.addVideos("Video 1");
	    //vs.addVideos("Video 2");
	}
}
