package tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) 
	{
		Point2D P1 = new Point2D ();
		Point2D P2 = new Point2D(10,30);
	    System.out.println("Co-ordinate is :" + P1.getDetails());
	    System.out.println("Co-ordinate is :" + P2.getDetails());
		System.out.println("Co-ordinate is :" + P1.isEqual(P2));
		System.out.println("CalculateDistance :" + P1.calculateDistance(P1, P2));
		

	}

}
