package wims_2017.ses2;
import java.awt.*;

public class tricky {
	
	public static void tricky1(Point p1, Point p2) {
		p1.x=100;
		p1.y=100;
		Point temp=p1;
		p1=p2;
		p2=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point pnt1 = new Point(0,0);
		Point pnt2 = new Point(0,0);
		
		//SOP's to check the value before calling the swap method
		
		System.out.println("Value of Points BEFORE Caling tricky method");
		
		System.out.println("Point pnt1 Values: X:= " + pnt1.x + " Y:= " + pnt1.y);
		System.out.println("Point pnt2 Values: X:= " + pnt2.x + " Y:= " + pnt2.y);
		
		//Let us invoke the swap method
		
		tricky1(pnt1,pnt2);
		
		System.out.println("Value of Points AFTER Caling tricky method");
		System.out.println("Point pnt1 Values: X:= " + pnt1.x + " Y:= " + pnt1.y);
		System.out.println("Point pnt2 Values: X:= " + pnt2.x + " Y:= " + pnt2.y);
	}

}
