package p1;

public class Box {
	int w;
	int h;
	int d;
	public String p;
	public Box(int w, int h, int d) {
		super();
		this.w = w;
		this.h = h;
		this.d = d;
	}
	 public int volume()
	{
		int p=w*h*d;
		System.out.println("VOLUME OF BOX IS "+p);
		return p;
		
	}
	
}
