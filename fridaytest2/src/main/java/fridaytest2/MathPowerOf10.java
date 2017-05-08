package fridaytest2;

public class MathPowerOf10 {

	public String powerOfTen(int input) {
		String start = "10 raised to the ";
		String end = "power is a ";
		switch (input) {
		case 6:
			return start + input + "th " + end + "Million";
		case 9:
			return start + input + "th " + end + "Billion";
		case 12:
			return start + input + "th " + end + "Trillion";
		case 15:
			return start + input + "th " + end + "Quadrillion";
		case 18:
			return start + input + "th " + end + "Quintillion";
		case 21:
			return start + input + "th " + end + "Sextillion";
		case 30:
			return start + input + "th " + end + "Nonillion";
		default:
			return "There is no Single word for " + start + input + "th power";
		}

	}

}
