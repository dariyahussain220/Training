package thirdweek;

public class SelectionSort {

	public String selectionSorting(int[] array) {

		String Result = "";
		int j;
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
			for (int i = 0; i < array.length - 1; i++) {
				int minindex = i;
				for (j = i + 1; j < array.length; j++)
					if (array[j] < array[minindex]) {
						minindex = j;
					}
				int smallerNumber = array[minindex];
				array[minindex] = array[i];
				array[i] = smallerNumber;

			}
			for (int k : array) {
				Result += k + " ";
			}
		}
		return Result;
	}

}
