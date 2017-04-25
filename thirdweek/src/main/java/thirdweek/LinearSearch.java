package thirdweek;

public class LinearSearch {

	public int searchElement(int array[], int a) {
		int length = array.length;
		int result = -1;
		if (array[length - 1] > a) {
			for (int i = 0; i < length; i++) {
				if (array[i] == a) {
					result = i;
				}
			}
		}
		return result;
	}
}
