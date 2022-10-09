public class ThreeDimensionShape {

	double width, height, depth;

	// constructor used when no dimension is defined
	ThreeDimensionShape() {
		width = height = depth = 0;
	}

	// constructor used when one dimension is defined
	ThreeDimensionShape(double length) {
		width = height = depth = length;
	}

	// constructor used when all dimensions are defined
	ThreeDimensionShape(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}

	// Driver code 
	public static void main(String[] args) {
		// create boxes using the various 

		// constructors 
		ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7); 

		ThreeDimensionShape shape2 = new ThreeDimensionShape(); 

		ThreeDimensionShape shape3 = new ThreeDimensionShape(8); 

		// get volume of first box 
		double volume1 = shape1.volume(); 
		System.out.println(" Volume of shape1 is " + volume1); 


		// get volume of second box 
		double volume2 = shape2.volume(); 
		System.out.println(" Volume of shape2 is " + volume2); 

		
		// get volume of cube 
		double volume3 = shape3.volume(); 
		System.out.println(" Volume of shape3 is " + volume3);
	}

}
