package p2;
import p1.Box;
import p1.Hello;
public class Demo {

	public static void main(String[] args) {
		int p=0;
		int z=0;
		
		// TODO Auto-generated method stub
		Box b1=new Box(3,6, 9);
		Hello h =new Hello(20, 30);
		b1.volume();
		h.fun();
		System.out.println("VOLUME OF BOX B IS "+b1.volume());
		//System.out.println("VOLUME OF BOX B IS "+b1.p);System.out.println("VALUE OF Z IN HELLO IS "+ h.fun());

	}

}
