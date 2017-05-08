package fridaytest2;

public class Traingle {

	private int a;
	private int b;
	private int c;

	public Traingle(int newa, int newb, int newc) {
		a = newa;
		b = newb;
		c = newc;
	}

	public boolean isTraingle() {
		if (a >= 0 && b >= 0 && c >= 0) {
			if (a + b > c && a + c > b && b + c > a) {
				return true;
			}
		}
		return false;
	}

	public double getAngle(int edge) {
		if (!(isTraingle())) {
			return 0.0;
		}
		if (edge == a) {
			return Math.acos((b * b) + (c * c) - (a * a)) / 2 * b * c;
		}
		else if (edge == b) {
			return Math.acos((a * a) + (c * c) - (b * b)) / 2 * a * c;
		}
		else if (edge == c) {
			return Math.acos((a * a) + (b * b) - (c * c)) / 2 * a * b;
		}
		return 0.0;
	}
}
