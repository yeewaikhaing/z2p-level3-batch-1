package day10.abstraction;

public class InterfacePoly {

	public static void main(String[] args) {
		/*Flying flyObj;
		
		flyObj = new Bird();
		flyObj.fly();
		
		flyObj = new Human();
		flyObj.fly();
		
		flyObj = new AirPlane();
		flyObj.fly();
		*/
		
		Flying[] flyarr = new Flying[3];
		
		flyarr[0] = new Bird();
		flyarr[1] = new Human();
		flyarr[2] = new AirPlane();
		
		for(Flying obj: flyarr)
			obj.fly();
	}
}
