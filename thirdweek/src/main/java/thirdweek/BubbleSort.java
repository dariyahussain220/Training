package thirdweek;

public class BubbleSort {

	public String bubbleSorting(int[] array) {
		int count = 0;
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
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - (1 + i); j++) {
					if (array[j] > array[j + 1]) {
						array[j] = array[j] + array[j + 1];
						array[j + 1] = array[j] - array[j + 1];
						array[j] = array[j] - array[j + 1];
						count++;
					}
				}
				if (count == 0)
					break;

			}
			for (int k : array) {
				Result += k + " ";
			}
		}
		return Result;
	}

}
