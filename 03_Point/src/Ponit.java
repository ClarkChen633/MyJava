

public class Ponit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Point {
			public double x, y;
			public Point(double x, double y) {
				this.x = x; this.y =y;
			}
			
			public double distanceFromOrigin(){
				return Math.sqrt(x*x + y*y);
			}
		}		

		Point p = new Point(3,4);
		double d = p.distanceFromOrigin();
		System.out.println("distance = " + d);
		p = new Point(6,8);
		d = p.distanceFromOrigin();
		System.out.println("distance2 = " + d);
		

	}


}
