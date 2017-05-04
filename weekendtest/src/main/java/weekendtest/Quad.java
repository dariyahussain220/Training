package weekendtest;

public class Quad {

	private double x1, x2, x3, x4;

	public Quad() {
		x1 = Double.NaN;
		x2 = Double.NaN;
	}

	public Quad(double newX1, double newX2, double newX3, double newX4) {
		x1 = newX1;
		x2 = newX2;
		x3 = newX3;
		x4 = newX4;
	}

	public void setPair(double x1, double x2, double x3, double x4) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
	}

	public double getX1() {
		return x1;
	}

	public double getX2() {
		return x2;
	}

	public double getX3() {
		return x3;
	}

	public double getX4() {
		return x4;
	}

	public Quad solveBiquadratic(double a, double b, double c) {
		QuadraticPair qp = new QuadraticPair();
		QuadraticPair qp2 = qp.solveQuadratic(a, b, c);
		double x = qp2.getX();
		double y = qp2.getY();
		if (x == Double.NaN || y == Double.NaN)
			return new Quad();
		else {
			return new Quad(Math.sqrt(x), -Math.sqrt(x), Math.sqrt(y),
					-Math.sqrt(y));
		}
	}
}
