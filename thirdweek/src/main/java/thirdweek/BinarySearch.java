package thirdweek;

public class BinarySearch {

	public int binerySearch(int[] a, int num) {
		int result = -1;
		int end = a.length - 1;
		int mid = end / 2;
		if (a[mid] > num) {

			for (int i = mid; i >= 0; i--) {
				if (a[i] == num) {
					result = i;
				}
			}
			return result;
		} else if (a[mid] < num) {
			for (int i = mid; i <= end; i++) {
				if (a[i] == num) {
					result = i;
				}
			}
		}
		return result;
	}

}
