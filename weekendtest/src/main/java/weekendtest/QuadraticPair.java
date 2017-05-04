package weekendtest;

public class QuadraticPair implements MyQuadratic {

	private double x1, x2;

	public QuadraticPair() {
		x1 = Double.NaN;
		x2 = Double.NaN;
	}

	public QuadraticPair(double newX1, double newX2) {
		x1 = newX1;
		x2 = newX2;
	}

	public void setPair(double x1, double x2) {
		this.x1 = x1;
		this.x2 = x2;
	}

	public double getX() {
		return x1;
	}

	public double getY() {
		return x2;
	}

	public QuadraticPair solveQuadratic(double a, double b, double c) {

		double insideRoot = (b * b) - 4 * a * c;
		double math = (Math.sqrt(insideRoot));
		double value1 = (-b + math) / 2 * a;
		double value2 = (-b - math) / 2 * a;
		
		if (insideRoot < 0) {
			return new QuadraticPair();
		} else {
			return new QuadraticPair(value1, value2);
		}
	}

	public static void main(String[] args) {
		int a=5,b=10,c=2;
		System.out.println((b * b) - 4 * a * c);
	}
}
