package thirdweek;

public class InsertionSort {

	public String insertionSorting(int[] array) {
		String Result = "";
		boolean negtive = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				negtive = true;
			}
		}
		if (array.length == 0) {
			return "Array Elements are not Entered";
		} else if (negtive) {
			return "you have Entered -ve values";
		} else {
			// insertion sort
			for (int i = 1; i < array.length; i++) {

				int valueinsert = array[i];
				int holder = i;
				while (holder > 0 && (valueinsert < array[holder - 1])) {
					array[holder] = array[holder - 1];
					holder--;
				}
				array[holder] = valueinsert;
			}

			for (int k : array) {
				Result += k + " ";
			}
		}
		return Result;
	}

}
